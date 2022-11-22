package shutdown.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }


}

@Component
class ControllerManager implements Controller {

    @Override
    public void shutdown() {
        System.out.println("calling ControllerManager#shutdown");
    }
}

interface Controller {

    void shutdown();
}