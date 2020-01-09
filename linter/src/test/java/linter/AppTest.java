/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package linter;

import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {
    @Test public void testAppHasAGreeting() {
        App classUnderTest = new App();
        assertNotNull("app should have a greeting", classUnderTest.getGreeting());
    }

    @Test public void testScanForSemicolonsWithManyErrors () {
        String input = "src/main/resources/gates.js";

        String expected = "Line 2 is missing a semicolon" + "\n" +
        "Line 3 is missing a semicolon" + "\n" +
        "Line 7 is missing a semicolon" + "\n" +
        "Line 12 is missing a semicolon" + "\n" +
        "Line 14 is missing a semicolon" + "\n" +
        "Line 16 is missing a semicolon" + "\n" +
        "Line 20 is missing a semicolon" + "\n" +
        "Line 28 is missing a semicolon" + "\n" +
        "Line 29 is missing a semicolon" + "\n" +
        "Line 34 is missing a semicolon" + "\n" +
        "Line 38 is missing a semicolon" + "\n";
        String actual = App.scanForSemicolons(input);

        assertEquals(expected, actual);
    }

    @Test public void testScanForSemicolonsWithNoErrors () {
        String input = "src/main/resources/noErrors.js";


    }

    @Test public void testScanForSemicolonsWithOneError () {

    }

    @Test public void testScanForSemicolonsWithFewErrors () {

    }

    @Test public void testScanForSemicolonsOnEmptyFile () {

    }
}
