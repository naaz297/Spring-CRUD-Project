package com.example.config;

import com.example.config.example.controller.UserController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {

    public static void main(String[] args) {

        ApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);

        UserController controller =
                context.getBean(UserController.class);

        controller.createUser("naaz");
        controller.listUser();
    }
}