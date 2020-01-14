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
    }

    @Test
    public void testConstructorFunction () {
        Assert.assertEquals("My Lil' Cube", input.name);
        Assert.assertEquals(4, input.rating);
        Assert.assertEquals("$$", input.price);
    }
}
