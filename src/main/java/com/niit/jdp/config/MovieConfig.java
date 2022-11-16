/*
 *Author Name:Praveen Kumar
 *Date: 16-Nov-22
 *Created With IntelliJ Idea Community Edition
 */


package com.niit.jdp.config;

import com.niit.jdp.domain.Movie;
import org.springframework.context.annotation.Bean;

public class MovieConfig {

    @Bean("movie1")
    public Movie getMovie() {
        return new Movie("Vikram", "Tamil", "2022");
    }

    @Bean("movie2")
    public Movie getMovie1() {
        return new Movie("Tenent", "English", "2020");
    }

    @Bean("movie3")
    public Movie getMovie3() {
        return new Movie("Red", "Telugu", "2021");
    }
}
