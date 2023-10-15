package cc.sofast.tenant.common;

import cc.sofast.tenant.common.utils.NamedInheritableThreadLocal;
import cc.sofast.tenant.common.utils.StringUtils;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @author siaron.wang@gmail.com
 */
public class TenantContext {

    /**
     * 为什么要用链表存储(准确的是栈)
     * <pre>
     * 为了支持嵌套切换，如ABC三个service都是不同的数据源
     * 其中A的某个业务要调B的方法，B的方法需要调用C的方法。一级一级调用切换，形成了链。
     * 传统的只设置当前线程的方式不能满足此业务需求，必须使用栈，后进先出。
     * </pre>
     */
    private static final ThreadLocal<Deque<String>> LOOKUP_KEY_HOLDER = new NamedInheritableThreadLocal<>("tenant-context") {
        @Override
        protected Deque<String> initialValue() {
            return new ArrayDeque<>();
        }
    };

    private TenantContext() {
    }

    /**
     * 获得当前线程数据源
     *
     * @return 数据源名称
     */
    public static String getTenant() {
        return LOOKUP_KEY_HOLDER.get().peek();
    }

    /**
     * 设置当前租户id
     * <p>
     * 如非必要不要手动调用，调用后确保最终清除
     * </p>
     *
     * @param tenant 当前租户
     */
    public static String setTenant(String tenant) {
        String dataSourceStr = StringUtils.isNotBlank(tenant) ? tenant : "";
        LOOKUP_KEY_HOLDER.get().push(dataSourceStr);
        return dataSourceStr;
    }

    /**
     * 清空当前线程数据源
     * <p>
     * 如果当前线程是连续切换数据源 只会移除掉当前线程的数据源名称
     * </p>
     */
    public static void clearCurrent() {
        Deque<String> deque = LOOKUP_KEY_HOLDER.get();
        deque.poll();
        if (deque.isEmpty()) {
            LOOKUP_KEY_HOLDER.remove();
        }
    }

    /**
     * 强制清空本地线程
     * <p>
     * 防止内存泄漏，如手动调用了push可调用此方法确保清除
     * </p>
     */
    public static void clear() {
        LOOKUP_KEY_HOLDER.remove();
    }
}
