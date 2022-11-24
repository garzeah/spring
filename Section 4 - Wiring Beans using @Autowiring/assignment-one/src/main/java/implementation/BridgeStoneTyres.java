package implementation;

import interfaces.Tyres;
import org.springframework.stereotype.Component;

@Component
public class BridgeStoneTyres implements Tyres {
    public String rotate() {
        return "BRIDGE";
    }
}
