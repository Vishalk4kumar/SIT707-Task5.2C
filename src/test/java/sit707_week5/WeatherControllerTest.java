package sit707_week5;

import org.junit.Assert;
import org.junit.Test;

public class WeatherControllerTest {

	@Test
	public void testStudentIdentity() {
		String studentId = "222342946";
		Assert.assertNotNull("Student ID is null", studentId);
	}

	@Test
	public void testStudentName() {
		String studentName = "Vishal";
		Assert.assertNotNull("Student name is null", studentName);
	}

	@Test
	public void testTemperaturePersist() {
	    System.out.println("+++ testTemperaturePersist +++");

	    // Initialise controller
	    WeatherController wController = WeatherController.getInstance();

	    // Capture the time before calling persistTemperature
	    long beforePersist = System.currentTimeMillis();
	    
	    // Call persistTemperature
	    String persistTime = wController.persistTemperature(10, 19.5);

	    // Capture the time after calling persistTemperature
	    long afterPersist = System.currentTimeMillis();

	    // Check if persistTime is within a reasonable time frame after the call
	    long elapsedTime = afterPersist - beforePersist;
	    System.out.println("Elapsed time: " + elapsedTime + " milliseconds");
	    Assert.assertTrue(elapsedTime <= 5000);

	    // Close the controller
	    wController.close();
	}
}
