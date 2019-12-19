package singleresponsibiltyclasses;

public class StoresCalculator {
	
	private int mandays;
	private boolean readyForLaunch = false;
	private final int kgsOfFoodPerManday = 2;
	private final int kgsOfWaterPerManday = 1;
	
	public StoresCalculator(int crew, int tripDuration) {
		this.readyForLaunch = true;
		this.mandays = crew * tripDuration;
	}
	
	public int getRequiredStores() {
		return (kgsOfFoodPerManday + kgsOfWaterPerManday) * mandays;
	}
	
	public boolean isReady() {
		return readyForLaunch;
	}
}
