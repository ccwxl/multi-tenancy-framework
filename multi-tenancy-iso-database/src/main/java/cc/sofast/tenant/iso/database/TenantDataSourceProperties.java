package cc.sofast.tenant.iso.database;

import java.util.HashMap;
import java.util.Map;

/**
 * @author <a href="mailto:siaron.wang@gmail.com">xielong.wang</a>
 * @since 1.0.0
 */
public class TenantDataSourceProperties {
    public static final String PREFIX = "spring.tenancy.datasource";

    /**
     * 是否开启多租户模式
     */
    private boolean enabled;


}
