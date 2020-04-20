package com.Gregory.HelloWorldNoLombok.model;

/**
 * @author Thiago Araújo
 * @since 15/04/2020 - 21:50
 * @version 1.0
 */
public class Game {
    private String title;
    private String genre;
    private String releaseDate;
    private double price;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "\nTitle: " + this.title
             + "\nGenre: " + this.genre
             + "\nRelease Date: " + this.releaseDate
             + "\nPrice: R$ " + this.price;
    }
}
