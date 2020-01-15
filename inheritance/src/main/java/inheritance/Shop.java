package inheritance;

import java.util.LinkedList;

public class Shop implements Reviewable {
    //instance variables
    String name;
    String description;
    int rating;

    int numberOfReviews;
    LinkedList<Review> shopReviews;

    //Constructor function
    Shop (String name, String description, int rating) {
        this.name = name;
        this.description = description;
        this.rating = rating;

        this.numberOfReviews = 1;
        this.shopReviews = new LinkedList<Review>();
    }

    public String toString() {
        return  "Shop: " + this.name + "\n" +
                "Rating: " + this.rating + " Stars\n" +
                "Reviews: " + this.numberOfReviews + "\n" +
                "Description: " + this.description;
    }

    public void addReview(Review newReview) {
        this.numberOfReviews ++;
        this.rating = this.rating + newReview.rating/this.numberOfReviews;
        newReview.shop = this;

        this.shopReviews.addFirst(newReview);
    }
}
