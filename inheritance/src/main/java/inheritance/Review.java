package inheritance;

public class Review {
    //instance variables
    int rating;
    String author;
    String body;
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

}
