package cc.sofast.tenant.common.exception;

/**
 * @author xielong.wang
 * throw excetion if tenant not found
 */
public class TenantNotFoundException extends TenantException {
    public TenantNotFoundException() {
        super("No TenantId found");
    }

    public TenantNotFoundException(String message) {
        super(message);
    }

    public TenantNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}
