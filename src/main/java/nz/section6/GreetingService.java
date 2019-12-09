package nz.section6;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class GreetingService {

    private final String prefix;

    public GreetingService(@Value("${greeting.prefix}") String prefix) {
        this.prefix = prefix;
    }

    public Greeting greet(String name) {
        return new Greeting(prefix + " " + name);
    }

}
