package cc.sofast.tenant.common.exception;

/**
 * @author xielong.wang
 */
public class TenantException extends RuntimeException {

    public TenantException(String message) {
        super(message);
    }

    public TenantException(String message, Throwable cause) {
        super(message, cause);
    }
}
