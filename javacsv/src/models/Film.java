package models;

public class Film {

    private String name;
    private double rating;
    private boolean watching;

    public Film(String name, double rating, boolean watching) {
        this.name = name;
        this.rating = rating;
        this.watching = watching;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public boolean isWatching() {
        return watching;
    }

    public void setWatching(boolean watching) {
        this.watching = watching;
    }
}
