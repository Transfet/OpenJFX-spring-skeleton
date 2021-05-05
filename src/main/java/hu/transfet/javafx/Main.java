package hu.transfet.javafx;

import hu.transfet.javafx.config.AppConfiguration;
import hu.transfet.javafx.util.ServiceLocator;
import javafx.application.Application;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfiguration.class);
        ServiceLocator.setApplicationContext(applicationContext);

        Application.launch(JavaFXStarter.class, args);
    }
}
