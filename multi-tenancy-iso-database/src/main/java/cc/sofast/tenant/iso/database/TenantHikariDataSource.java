package cc.sofast.tenant.iso.database;

import com.zaxxer.hikari.HikariConfig;
import org.springframework.boot.context.properties.NestedConfigurationProperty;

/**
 * @author <a href="mailto:siaron.wang@gmail.com">xielong.wang</a>
 * @since 1.0.0
 */
public class TenantHikariDataSource extends TenantDataSource {

    @NestedConfigurationProperty
    private HikariConfig hikari;

    public HikariConfig getHikari() {
        return hikari;
    }

    public void setHikari(HikariConfig hikari) {
        this.hikari = hikari;
    }
}
