package singleresponsibiltyclasses;

public class OxygenCalculator {
	
	private int tripDurationInDays;
	private boolean readyForLaunch = false;
	private int crew;
	private final int oxygenBottlesPerManday = 3;
	
	public OxygenCalculator(int tripDurationInDays, int crew) {
		this.readyForLaunch = true;
		this.tripDurationInDays = tripDurationInDays;
		this.crew = crew;
	}
	
	public int getRequiredNumberOfOxygenBottles () {
		
		int mandaysInSpace = tripDurationInDays * crew;
		int requiredOxygenBottles = mandaysInSpace * oxygenBottlesPerManday;	
		return requiredOxygenBottles;	
	}
	
	public boolean isReady() {
		return readyForLaunch;
	}
}
