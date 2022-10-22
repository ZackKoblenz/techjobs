package org.launchcode.techjobs.oo.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.launchcode.techjobs.oo.*;

import static org.junit.Assert.*;

/**
 * Created by LaunchCode
 */
@RunWith(JUnit4.class)
public class JobTest {
    @Test
    public void testSettingJobId() {
        Job streamer = new Job();
        Job youTuber = new Job();
        assertNotEquals(streamer.getId(), youTuber.getId());
    }

    @Test
    public void testJobConstructorSetsAllFields() {
        Job productTester = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        Job productTester2 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        assertTrue("Name Test Failed", productTester.getName().equals("Product tester"));

        assertTrue("Employer Test Failed", productTester.getEmployer().toString().equals("ACME"));

        assertTrue("Location Test Failed", productTester.getLocation().toString().equals("Desert"));

        assertTrue("Position Type Test Failed", productTester.getPositionType().toString().equals("Quality Control"));

        assertTrue("Core Competency Test Failed", productTester.getCoreCompetency().toString().equals("Persistence"));
    }

    @Test
    public void testToString() {
        Job streamer = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        Job youtuber = new Job();

        System.out.println(streamer.toString() + "\n" + youtuber.toString());
    }

    @Test
    public void testToStringStartsAndEndsWithNewLine() {
        Job streamer = new Job();
        assertEquals(streamer.toString().charAt(streamer.toString().length() - 1), "\n");
    }

    @Test
    public void testToStringContainsCorrectLabelsAndData() {

    }

    @Test
    public void testToStringHandlesEmptyField() {
        Job streamer = new Job();

    }
}
