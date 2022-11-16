package com.niit.jdp;

import com.niit.jdp.config.MovieConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        /* Creating a new instance of the `AnnotationConfigApplicationContext` class and passing the `MovieConfig` class as
         a parameter.*/
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MovieConfig.class);

    }
}
