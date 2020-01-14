package inheritance;

public class Restaurant {
    //instance variables
    String name;
    int rating; // (0 - 5)
    String price; // ($ - $$$$)

    //Constructor function
    Restaurant (String name, int rating, String price) {
        this.name = name;
        this.rating = rating;
        this.price = price;
    }

}
