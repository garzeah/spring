package config;

import beans.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

/*
Spring @Configuration annotation is part of the spring core framework.
Spring configuration annotation indicates that the class has @Bean
definition methods. So Spring container can process the class and
generate Spring beans to be used in the application
*/
@Configuration
public class ProjectConfig {

    /*
    @Bean annotation, which lets Spring know that it needs to call
    this method when it initializes it context and adds the
    returned value to the context
    */
    @Primary // If multiple types and we don't specify, will default to this
    @Bean(name="vehicle1")
    Vehicle vehicle() {
        var veh = new Vehicle();
        veh.setName("Audi 8");
        return veh;
    };

    /*
    When we create multiple objects of the same type and try to
    fetch the bean from context by type, then Spring cannot
    guess which instance you’re referring to. This will
    lead to NoUniqueBeanDefinitionException error. We
    can use bean names to avoid this
    */
    @Bean(value="vehicle2")
    Vehicle vehicle2() {
        var veh = new Vehicle();
        veh.setName("Honda");
        return veh;
    };

    @Bean(value="vehicle3")
    Vehicle vehicle3() {
        var veh = new Vehicle();
        veh.setName("Tesla");
        return veh;
    };

    /*
    The method names usually follow verbs notation. But for methods
    which we will use to create beans, can use nouns as names. This
    will be a good practice as the method names will become bean
    names as well in the context
    */
    @Bean
    String hello() {
        return "Hello World";
    }

    @Bean
    Integer number() {
        return 16;
    }
}
