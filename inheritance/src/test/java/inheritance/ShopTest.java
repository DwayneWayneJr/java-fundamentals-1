package inheritance;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ShopTest {
    Shop input;

    @Before
    public void initialize () throws Exception {
        input = new Shop ("The Good Book", "It's a bookstore", 5);

        Review myReview = new Review(1, "A. Monster","I hate books");
        input.addReview(myReview);
    }

    @Test
    public void testConstructorFunction () {
        Assert.assertEquals("The Good Book", input.name);
        Assert.assertEquals(3, input.rating);
        Assert.assertEquals("It's a bookstore", input.description);
    }

    @Test
    public void testToString () {
        String expected =
                "Shop: The Good Book" + "\n" +
                "Rating: 3 Stars" + "\n" +
                "Reviews: 2" + "\n" +
                "Description: It's a bookstore";

        Assert.assertEquals(expected, input.toString());
    }

    @Test
    public void testAddReview_ToRestaurant () {
        Assert.assertEquals("I hate books", input.shopReviews.getFirst().body);
    }

    @Test
    public void testAddReview_UpdateStars () {
        Assert.assertEquals(3, input.rating);
    }

}
