package beans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Vehicle {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @PostConstruct
    public void initialize() {
        this.name = "Honda";
    }

    @PreDestroy
    public void destroy() {
        System.out.println("Destroying vehicle bean");
    }

    public void printHello() {
        System.out.println("Hello from component vehicle bean");
    }
}
