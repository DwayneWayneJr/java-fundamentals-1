package inheritance;

public class Review {
    //instance variables
    int rating;
    String author;
    String body;
    String movie;
    Review next;
    Restaurant restaurant;
    Shop shop;
    Theater theater;

    //Constructor function
    Review (int rating, String author, String review) {
        this.rating = rating;
        this.author = author;
        this.body = review;

        this.next = null;
        this.restaurant = null;
        this.shop = null;
        this.theater = null;
    }

    Review (int rating, String author, String movie, String review) {
        this.rating = rating;
        this.author = author;
        this.body = review;
        this.movie = movie;

        this.theater = null;
        this.next = null;
    }

}
