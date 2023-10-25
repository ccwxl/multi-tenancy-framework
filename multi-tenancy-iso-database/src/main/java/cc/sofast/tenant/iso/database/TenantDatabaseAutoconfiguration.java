package cc.sofast.tenant.iso.database;


import org.springframework.beans.factory.InitializingBean;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.boot.autoconfigure.AutoConfigureBefore;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

/**
 * @author apple
 */
@AutoConfiguration
@EnableConfigurationProperties({TenantDataSourceProperties.class,Hikari.class})
@AutoConfigureBefore(value = DataSourceAutoConfiguration.class)
@ConditionalOnProperty(prefix = TenantDataSourceProperties.PREFIX, name = "enabled", havingValue = "true", matchIfMissing = true)
public class TenantDatabaseAutoconfiguration implements InitializingBean {

    private final TenantDataSourceProperties properties;

    public TenantDatabaseAutoconfiguration(TenantDataSourceProperties properties) {
        this.properties = properties;
    }

    @Override
    public void afterPropertiesSet() throws Exception {

    }
}
