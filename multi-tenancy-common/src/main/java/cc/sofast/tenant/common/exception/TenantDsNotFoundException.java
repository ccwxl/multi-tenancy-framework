package cc.sofast.tenant.common.exception;

/**
 * Tenant DataSource not found
 */
public class TenantDsNotFoundException extends TenantException {

    public TenantDsNotFoundException() {
        super("No Tenant DataSource found");
    }

    public TenantDsNotFoundException(String message) {
        super(message);
    }

    public TenantDsNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}
