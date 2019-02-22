package inft16.testing.cooling;

public class CoolingController {
	
	private int tempIs = 0;
	private int coolingLevel = 0;
		
	public void setCurrentTempInDegreeCelsius(int currentTemp) {
		this.tempIs = currentTemp;
	}
	
	public int getCoolingLevel() {
		return coolingLevel;
	}
	
	public void increaseCoolingIfPossible(int tempShould, double batteryCapacity, boolean engineIsRunning) {
		if (tempIs >= tempShould) {
			if (batteryCapacity >= 0.8 || engineIsRunning) {
				if (coolingLevel <= 3) { 
					coolingLevel++;
				}
			}
		}
	}
	
}
