import beans.Vehicle;
import config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.setName("Honda City");
        System.out.println("Vehicle name from non-spring context is: " + vehicle.getName());
        /*
        The var keyword was introduced in Java 10. Type inference is used
        in var keyword in which it detects automatically the datatype of
        a variable based on the surrounding context.
        */
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        // Using the @Primary annotation; If @PostConstruct is enabled, it'll be replaced with Honda
        Vehicle veh = context.getBean(Vehicle.class);
        System.out.println("Primary Vehicle name from Spring Context is: " + veh.getName());

        // Using the @Bean annotation; If @PostConstruct is enabled, it'll be replaced with Honda
        Vehicle veh1 = context.getBean("vehicle1", Vehicle.class);
        Vehicle veh2 = context.getBean("vehicle2", Vehicle.class);
        Vehicle veh3 = context.getBean("vehicle3", Vehicle.class);
        System.out.println("Vehicle name from Spring Context is: " + veh1.getName());
        System.out.println("Vehicle name from Spring Context is: " + veh2.getName());
        System.out.println("Vehicle name from Spring Context is: " + veh3.getName());

        // @PreDestroy annotation, cleaning the beans after we close the context
        context.close();
    }
}
