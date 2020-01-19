package inheritance;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TheaterTest {
    Theater regal;

    @Before
    public void setUp () throws Exception {
        regal = new Theater("regal");
        regal.addMovie("Frozen");
    }

    @Test
    public void testTheaterConstructor () {
        Assert.assertEquals("regal", regal.name);
    }

    @Test
    public void testAddMovie () {
        Assert.assertEquals("Frozen", regal.movies.get(0));
    }

    @Test
    public void testRemoveMovie() {
        regal.removeMovie("Frozen");

        Assert.assertEquals(0, regal.movies.size());
    }
}
