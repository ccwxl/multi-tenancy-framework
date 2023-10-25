package cc.sofast.tenant.iso.database.datasource;

import cc.sofast.tenant.iso.database.TenantDataSource;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.jdbc.datasource.AbstractDataSource;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * @author <a href="mailto:siaron.wang@gmail.com">xielong.wang</a>
 * @since 1.0.0
 */
public class TenantRoutingDataSource extends AbstractDataSource
        implements TenantDataSourceRegister, InitializingBean, DisposableBean {

    @Override
    public Connection getConnection() throws SQLException {
        return null;
    }

    @Override
    public Connection getConnection(String username, String password) throws SQLException {
        return null;
    }

    @Override
    public void destroy() throws Exception {

    }

    @Override
    public void afterPropertiesSet() throws Exception {

    }

    @Override
    public boolean register(TenantDataSource tds) {

        return false;
    }

    @Override
    public boolean remove(String tenant) {

        return false;
    }
}
