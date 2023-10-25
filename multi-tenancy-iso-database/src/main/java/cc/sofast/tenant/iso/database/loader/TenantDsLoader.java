package cc.sofast.tenant.iso.database.loader;

import cc.sofast.tenant.iso.database.TenantDataSource;

import java.util.List;
import java.util.Map;

/**
 * @author <a href="mailto:siaron.wang@gmail.com">xielong.wang</a>
 * @since 1.0.0
 */
public interface TenantDsLoader {

    List<TenantDataSource> loaderTenantDs();

}
