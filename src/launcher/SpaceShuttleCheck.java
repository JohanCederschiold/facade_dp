package launcher;

import singleresponsibiltyclasses.FuelCalculator;
import singleresponsibiltyclasses.OxygenCalculator;
import singleresponsibiltyclasses.StoresCalculator;

public class SpaceShuttleCheck {
	
	private int totalFuel;
	private boolean isReady = false;
	
	public SpaceShuttleCheck(int tripduration, int crew, int loads) {
		
		StoresCalculator stores = new StoresCalculator(crew, tripduration);
		OxygenCalculator oxygen = new OxygenCalculator(tripduration, crew);
		FuelCalculator fuelCalculator = new FuelCalculator(crew, loads, oxygen.getRequiredNumberOfOxygenBottles(), stores.getRequiredStores());
		this.totalFuel = fuelCalculator.getRequiredFuel();
		
		if (stores.isReady() && oxygen.isReady() && fuelCalculator.isReady()) {
			isReady = true;
		}
	}
	
	public int getTotalFuel() {
		return totalFuel;
	}
	
	public boolean shuttleReady() {
		return isReady;
	}

}
