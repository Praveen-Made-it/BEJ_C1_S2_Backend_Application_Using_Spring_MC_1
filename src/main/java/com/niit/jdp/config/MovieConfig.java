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

}
