package inheritance;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TheaterTest {
    Theater regal;

    @Before
    public void setUp () throws Exception {
        regal = new Theater("regal", 3);
        regal.addMovie("Frozen");

        Review myTheaterReview = new Review(9, "Rachael","This theater has good popcorn to butter ratio");
        regal.addReview(myTheaterReview);

        Review myMovieReview = new Review(10, "Rachael", "Frozen", "Idina Menzel is amazing");
        regal.addReview(myMovieReview);
    }

    @Test
    public void testTheaterConstructor () {
        Assert.assertEquals("regal", regal.name);
        Assert.assertEquals(10, regal.rating);
    }

    @Test
    public void testAddMovie () {
        Assert.assertEquals("Frozen", regal.movies.get(0));
    }

    @Test
    public void testRemoveMovie () {
        regal.removeMovie("Frozen");

        Assert.assertEquals(0, regal.movies.size());
    }

    @Test
    public void testTheaterReview () {
        Assert.assertEquals(10, regal.rating);
        Assert.assertEquals("This theater has good popcorn to butter ratio", regal.theaterReviews.get(1).body);
    }

    @Test
    public void testTheaterReview_MovieFrozen () {
        Assert.assertEquals("Frozen", regal.theaterReviews.get(0).movie);
        Assert.assertEquals("Idina Menzel is amazing", regal.theaterReviews.get(0).body);
    }
}
