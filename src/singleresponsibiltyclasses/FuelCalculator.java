package singleresponsibiltyclasses;

public class FuelCalculator {
	
	private int crew;
	private int loadInKg;
	private int noOxygenBottles;
	private int stores;
	private final int defaultLoad = 10000;
	private final int avgCrewWeight = 82;
	private final int kgsOfFuelPerKg = 3;
	private final int oxygenBottleWeight = 1;
	private boolean readyForLaunch = false;
		
	public FuelCalculator(int crew, int loadInKg, int noOxygenBottles, int stores) {
		this.readyForLaunch = true;
		this.crew = crew;
		this.loadInKg = loadInKg;
		this.noOxygenBottles = noOxygenBottles;
		this.stores = stores;
	}
	
	public int getRequiredFuel() {
		return kgsOfFuelPerKg * ((crew * avgCrewWeight) + defaultLoad + loadInKg + (noOxygenBottles * oxygenBottleWeight) + stores);
	}
	
	public boolean isReady() {
		return readyForLaunch;
	}
}
