package hu.transfet.javafx.util;

import org.springframework.context.ApplicationContext;


public class ServiceLocator {

    private static ApplicationContext context;

    public static void setApplicationContext(ApplicationContext ctx) {

        context = ctx;
    }

    public static <T> T getService(Class<T> tClass) {
        return context.getBean(tClass);
    }
}
