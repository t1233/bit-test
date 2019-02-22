package inft16.testing.math;

public class GreatestCommonDivisorCalculator {

	public int calculateGcd(int numberA, int numberB) {
		while (numberB != 0) {
			if (numberA > numberB) {
				numberA = numberA - numberB;
			} else {
				numberB = numberB - numberA;
			}
		}
		return numberA;
	}

}
