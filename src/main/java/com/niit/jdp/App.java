package com.niit.jdp;

import com.niit.jdp.config.MovieConfig;
import com.niit.jdp.domain.Movie;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        /* Creating a new instance of the `AnnotationConfigApplicationContext` class and passing the `MovieConfig` class as
         a parameter.*/
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MovieConfig.class);

        Movie movie1 = context.getBean("movie1", Movie.class);
        System.out.println("Movie1: " + movie1);

        Movie movie2 = context.getBean("movie2", Movie.class);
        System.out.println("Movie2: " + movie2);

        Movie movie3 = context.getBean("movie3", Movie.class);
        System.out.println("Movie3: " + movie3);

    }
}
