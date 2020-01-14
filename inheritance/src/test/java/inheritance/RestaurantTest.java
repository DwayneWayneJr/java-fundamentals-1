package inheritance;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import javax.naming.spi.ResolveResult;

public class RestaurantTest {
    Restaurant input;

    @Before
    public void initialize () throws Exception {
        input = new Restaurant("My Lil' Cube", 4, "$$");

        Review myReview = new Review(20, "Best ramen ever");
        input.addReview(myReview);
    }

    @Test
    public void testConstructorFunction () {
        Assert.assertEquals("My Lil' Cube", input.name);
        Assert.assertEquals(4, input.rating);
        Assert.assertEquals("$$", input.price);
    }

    @Test
    public void testToString () {
        String expected =
                "Restaurant: My Lil' Cube" + "\n" +
                "Rating: 4 Stars" + "\n" +
                "Reviews: 1" + "\n" +
                "Price: $$";

        Assert.assertEquals(expected, input.toString());
    }

    @Test
    public void testAddReview_ToRestaurant () {
        Assert.assertEquals("Best ramen ever", input.restaurantReviews.getFirst().body);
    }

    @Test
    public void testAddReview_UpdateStars () {
        Assert.assertEquals(14, input.rating);
    }
}
