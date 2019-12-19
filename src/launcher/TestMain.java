package launcher;

public class TestMain {

	public static void main(String[] args) {
		
		SpaceShuttleCheck shuttle = new SpaceShuttleCheck(100, 3, 500);
		System.out.println(shuttle.getTotalFuel());
		System.out.println(shuttle.shuttleReady());

	}

}
