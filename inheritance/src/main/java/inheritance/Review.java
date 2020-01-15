package inheritance;

public class Review {
    //instance variables
    int rating;
    String body;
    Review next;
    Restaurant restaurant;

    //Constructor function
    Review (int rating, String review) {
        this.rating = rating;
        this.body = review;
        this.next = null;
        this.restaurant = null;
    }

}
