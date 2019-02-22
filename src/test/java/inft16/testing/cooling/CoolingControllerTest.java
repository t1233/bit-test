package inft16.testing.cooling;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CoolingControllerTest {

	@Test
	public void testCoolingLevelShouldIncrease() {
		// 1. Create test object
		CoolingController controller = new CoolingController();
		
		// 2. Setup test object with test data
		controller.setCurrentTempInDegreeCelsius(25);
		
		// 3. Run method we want to test
		controller.increaseCoolingIfPossible(22, 0.9, true);
		
		// 4. Check results
		assertEquals(1, controller.getCoolingLevel());
	}
	
}
