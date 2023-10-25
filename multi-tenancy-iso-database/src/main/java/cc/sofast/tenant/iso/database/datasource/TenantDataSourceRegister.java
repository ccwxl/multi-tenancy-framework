package cc.sofast.tenant.iso.database.datasource;

import cc.sofast.tenant.iso.database.TenantDataSource;

/**
 * @author <a href="mailto:siaron.wang@gmail.com">xielong.wang</a>
 * @since 1.0.0
 */
public interface TenantDataSourceRegister {

    boolean register(TenantDataSource tds);

    boolean remove(String tenant);
}
