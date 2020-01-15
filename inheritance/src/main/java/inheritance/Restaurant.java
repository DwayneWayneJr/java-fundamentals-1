package inheritance;

import java.util.LinkedList;

public class Restaurant implements Reviewable {
    //instance variables
    String name;
    int rating; // (0 - 5)
    String price; // ($ - $$$$)
    int numberOfReviews;

    LinkedList<Review>restaurantReviews;


    //Constructor function
    Restaurant (String name, int rating, String price) {
        this.name = name;
        this.rating = rating;
        this.price = price;

        this.numberOfReviews = 1;
        this.restaurantReviews = new LinkedList<Review>();
    }

    //instance methods
    public String toString () {
        return "Restaurant: " + this.name + "\n" +
                "Rating: " + this.rating + " Stars\n" +
                "Reviews: " + this.numberOfReviews + "\n" +
                "Price: " + this.price;
    }

    public void addReview (Review newReview) {
        this.numberOfReviews ++;
        this.rating = this.rating + newReview.rating/this.numberOfReviews;
        newReview.restaurant = this;

        this.restaurantReviews.addFirst(newReview);
    }

}
