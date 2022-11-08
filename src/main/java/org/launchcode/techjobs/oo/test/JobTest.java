package org.launchcode.techjobs.oo.test;

import org.junit.Assert;
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

        Assert.assertTrue(productTester.getName() instanceof String);

        Assert.assertTrue(productTester.getEmployer() instanceof Employer);

        Assert.assertTrue(productTester.getLocation() instanceof Location);

        Assert.assertTrue(productTester.getPositionType() instanceof PositionType);

        Assert.assertTrue(productTester.getCoreCompetency() instanceof CoreCompetency);

        Assert.assertEquals(productTester2.getCoreCompetency().toString(), productTester.getCoreCompetency().toString());

        Assert.assertEquals(productTester2.getName(), productTester.getName());

        Assert.assertEquals(productTester2.getEmployer().toString(), productTester.getEmployer().toString());

        Assert.assertEquals(productTester2.getLocation().toString(), productTester.getLocation().toString());

        Assert.assertEquals(productTester2.getPositionType().toString(), productTester.getPositionType().toString());
    }

    @Test
    public void testToString() {
        Job streamer = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        Job youtuber = new Job();

        System.out.println(streamer.toString() + "\n" + youtuber.toString());
    }

    @Test
    public void testToStringStartsAndEndsWithNewLine() {
        Job streamer = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Assert.assertEquals(streamer.toString().charAt(0), '\n');
        Assert.assertEquals(streamer.toString().charAt(119),'\n');
    }

    @Test
    public void testToStringContainsCorrectLabelsAndData() {
        Job streamer = new Job();
        Job youTuber = new Job();
        Assert.assertEquals(streamer.toString(), youTuber.toString());
    }

    @Test
    public void testToStringHandlesEmptyField() {
        Job streamer = new Job("", new Employer("Employer"), new Location("Location"), new PositionType(""), new CoreCompetency("Core Competency"));
        Assert.assertEquals(streamer.toString(), ("\n" +
                "ID: " + streamer.getId() + "\n" +
                "Name: " + "Data not available" + "\n" +
                "Employer: " + "Employer" + "\n" +
                "Location: " + "Location" + "\n" +
                "Position Type: " + "Data not available" + "\n" +
                "Core Competency: " + "Core Competency" + "\n"));
    }

    @Test
    public void testJobsForEquality() {
        Job streamer = new Job(
                "Product tester",
                new Employer("ACME"),
                new Location("Desert"),
                new PositionType("Quality control"),
                new CoreCompetency("Persistence"));
        Job streamer2 = new Job(
                "Product tester",
                new Employer("ACME"),
                new Location("Desert"),
                new PositionType("Quality control"),
                new CoreCompetency("Persistence"));
        Assert.assertFalse(streamer.getId() == streamer2.getId());
    }
}
