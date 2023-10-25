package cc.sofast.tenant.iso.database;

import cc.sofast.tenant.common.model.DataIso;
import cc.sofast.tenant.common.model.DatasourceIso;
import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.autoconfigure.jdbc.JdbcConnectionDetails;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.util.StringUtils;

import javax.sql.DataSource;
import java.util.List;

/**
 * @author <a href="mailto:siaron.wang@gmail.com">xielong.wang</a>
 * @since 1.0.0
 */
public class TenantDataSource extends DataSourceProperties {

    /**
     * 租户列表，tenant如果只有一个则也是独占
     */
    private List<String> tenants;

    /**
     * 隔离方式
     */
    private DataIso dataIso = DataIso.SCHEMA;

    /**
     * 租户数据源类型
     */
    private DatasourceIso tenantDsType = DatasourceIso.EXCLUSIVE;

    public List<String> getTenants() {
        return tenants;
    }

    public void setTenants(List<String> tenants) {
        this.tenants = tenants;
    }

    public DataIso getDataIso() {
        return dataIso;
    }

    public void setDataIso(DataIso dataIso) {
        this.dataIso = dataIso;
    }

    public DatasourceIso getTenantDsType() {
        return tenantDsType;
    }

    public void setTenantDsType(DatasourceIso tenantDsType) {
        this.tenantDsType = tenantDsType;
    }

}
