/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package basiclibrary;

import org.junit.Assert;
import org.junit.Test;
import java.util.Arrays;
import static org.junit.Assert.*;

public class LibraryTest {
    @Test public void testSomeLibraryMethod() {
        Library classUnderTest = new Library();
        assertTrue("someLibraryMethod should return 'true'", classUnderTest.someLibraryMethod());
    }

    @Test public void testRollLength () {
       int[] actual = Library.roll(4);
       int[] expected = new int[4];
       System.out.println(Arrays.toString(actual));
       assertEquals(expected.length, actual.length);
    }

//    @Test public void testRollInputs () {
//        int min = 1;
//        int max = 6;
//
//        int[] actual = Library.roll(5);
//
//        for (int i = 0; i < actual.length; i++) {
//            Assert.assertTrue("Rolled higher than 1", min >= actual[i]);
//            Assert.assertTrue("Rolled lower than 6", max <= actual[i]);
//        }
//    }

    @Test public void testContainsDuplicatesFalse () {
        int[] input1 = new int[] {1, 2, 3, 4, 5};
        boolean actual = Library.containsDuplicates(input1);

        assertTrue(actual == false);
    }

    @Test public void testContainsDuplicatesTrue () {
        int[] input2 = new int[] {1, 2, 2, 1, 6};
        boolean actual = Library.containsDuplicates(input2);

        assertTrue(actual == true);
    }

    @Test public void testCalculateSingleArrayAverage () {
        int[] input1 = new int[] {1, 2, 3, 4};
        int[] input2 = new int[] {3, 2, 2, 2};

        float actual1 = Library.calculateSingleArrayAverages(input1);
        float actual2 = Library.calculateSingleArrayAverages(input2);

        assertTrue(2.5 == actual1);
        assertTrue(2.25 == actual2);


    }


}
