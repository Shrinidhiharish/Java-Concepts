package Interface;

public class Class_For_Implementation implements bus_Interface {

	@Override
	public void start() {
		System.out.println("Starting");
		
	}

	@Override
	public void stop() {
		System.out.println("Stopping");
	}

	@Override
	public void restart() {
		System.out.println("Restarting");
		
	}

	@Override
	public void refuel() {
		System.out.println("Refueling");
		
	}

	@Override
	public void reak() {
		System.out.println("Breaks");
	}

}
