package cc.sofast.tenant.iso.database;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.NestedConfigurationProperty;

import java.util.HashMap;
import java.util.Map;

/**
 * @author <a href="mailto:siaron.wang@gmail.com">xielong.wang</a>
 * @since 1.0.0
 */
@ConfigurationProperties(prefix = "spring.tenancy")
public class Hikari  {

    @NestedConfigurationProperty
    private Map<String, TenantHikariDataSource> datasource = new HashMap<>();

}
