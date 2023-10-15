package cc.sofast.tenant.common;


/**
 * {@link InheritableThreadLocal} subclass that exposes a specified name
 * as {@link #toString()} result (allowing for introspection).
 *
 * @author xielong.wang
 */
public class NamedInheritableThreadLocal<T> extends InheritableThreadLocal<T> {

    private final String name;

    /**
     * Create a new NamedInheritableThreadLocal with the given name.
     *
     * @param name a descriptive name for this ThreadLocal
     */
    public NamedInheritableThreadLocal(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return this.name;
    }

}
