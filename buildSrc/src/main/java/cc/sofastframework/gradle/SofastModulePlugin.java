package cc.sofastframework.gradle;

import io.spring.gradle.dependencymanagement.DependencyManagementPlugin;
import org.gradle.api.Plugin;
import org.gradle.api.Project;
import org.gradle.api.plugins.JavaBasePlugin;
import org.gradle.api.plugins.JavaPlugin;
import org.springframework.boot.gradle.plugin.SpringBootPlugin;

/**
 * @author xielong.wang
 */
public class SofastModulePlugin implements Plugin<Project> {

    @Override
    public void apply(Project project) {
        System.out.println("Sofast Dependency Manager plugin.");

        //java 插件
        project.getPlugins().apply(JavaPlugin.class);
        project.getPlugins().apply(JavaBasePlugin.class);

        //springboot
        Object springBootPluginEnable = project.getProperties().get("springBootPluginEnabled");
        if (Boolean.valueOf(String.valueOf(springBootPluginEnable)).equals(Boolean.TRUE)) {
            System.out.println("enabled SpringBootPlugin and DependencyManagementPlugin.");
            project.getPlugins().apply(SpringBootPlugin.class);
            project.getPlugins().apply(DependencyManagementPlugin.class);
        }

        project.getPlugins().apply(JavaConventionsPlugin.class);

        //依赖仓库
        project.getRepositories().mavenLocal();
        project.getRepositories().mavenCentral();
        project.getRepositories().maven(mavenArtifactRepository -> mavenArtifactRepository.setUrl("https://maven.aliyun.com/nexus/content/groups/public/"));
        project.getRepositories().maven(mavenArtifactRepository -> mavenArtifactRepository.setUrl("https://repo.spring.io/milestone"));
    }
}

