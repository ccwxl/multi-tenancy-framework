package cc.sofast.tenant.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.sql.DataSource;

/**
 * @author <a href="mailto:siaron.wang@gmail.com">xielong.wang</a>
 * @since 1.0.0
 */
@SpringBootApplication
public class DocApp implements CommandLineRunner {
    public static void main(String[] args) {
        SpringApplication.run(DocApp.class, args);
    }

    @Autowired
    private DataSource dataSource;

    @Override
    public void run(String... args) throws Exception {

        System.out.println(dataSource.getConnection().getCatalog());
    }
}
