package config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"implementation", "services"})
@ComponentScan(basePackageClasses = {beans.Vehicle.class, beans.Person.class})
public class ProjectConfig {
}
