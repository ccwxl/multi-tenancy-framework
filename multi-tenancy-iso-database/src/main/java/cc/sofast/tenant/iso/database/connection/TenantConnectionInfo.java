package cc.sofast.tenant.iso.database.connection;

import java.util.function.Supplier;

/**
 * @author <a href="mailto:siaron.wang@gmail.com">xielong.wang</a>
 * @since 1.0.0
 */
public class TenantConnectionInfo {

    /**
     * schema name (schema) or tenant(TLS)
     */
    private Supplier<String> uniqueCode;

    private String datasource;

    private String tenant;

    public TenantConnectionInfo() {
    }

    public Supplier<String> getUniqueCode() {
        return uniqueCode;
    }

    public void setUniqueCode(Supplier<String> uniqueCode) {
        this.uniqueCode = uniqueCode;
    }

    public String getDatasource() {
        return datasource;
    }

    public void setDatasource(String datasource) {
        this.datasource = datasource;
    }

    public String getTenant() {
        return tenant;
    }

    public void setTenant(String tenant) {
        this.tenant = tenant;
    }
}
