/*
 *Author Name:Praveen Kumar
 *Date: 16-Nov-22
 *Created With IntelliJ Idea Community Edition
 */


package com.niit.jdp.domain;

public class Movie {
    private String movieName;
    private String movieLanguage;
    private String movieReleaseYear;

    public Movie() {
    }

    public Movie(String movieName, String movieLanguage, String movieReleaseYear) {
        this.movieName = movieName;
        this.movieLanguage = movieLanguage;
        this.movieReleaseYear = movieReleaseYear;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getMovieLanguage() {
        return movieLanguage;
    }

    public void setMovieLanguage(String movieLanguage) {
        this.movieLanguage = movieLanguage;
    }

    public String getMovieReleaseYear() {
        return movieReleaseYear;
    }

    public void setMovieReleaseYear(String movieReleaseYear) {
        this.movieReleaseYear = movieReleaseYear;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "movieName='" + movieName + '\'' +
                ", movieLanguage='" + movieLanguage + '\'' +
                ", movieReleaseYear='" + movieReleaseYear + '\'' +
                '}';
    }
}
