package com.example._12;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Application1 {

    public static void run(String fileName1, String fileName2) {
        SpringApplication.run(Application1.class);
        ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);
        FileWorker fw = context.getBean(FileWorker.class);
        fw = new FileWorker(fileName1, fileName2);
    }

}
