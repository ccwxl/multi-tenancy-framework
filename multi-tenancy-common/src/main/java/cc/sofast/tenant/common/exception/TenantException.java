package cc.sofast.tenant.common.exception;

/**
 * tenant Exception Top-level exception abstraction
 *
 * @author xielong.wang
 */
public abstract class TenantException extends RuntimeException {

    public TenantException(String message) {
        super(message);
    }

    public TenantException(String message, Throwable cause) {
        super(message, cause);
    }
}
