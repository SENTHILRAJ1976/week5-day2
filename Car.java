package week1.day1;

public class Car {

	
	public void driveCar() {
		System.out.println("The Car is drivable");
	}
	
	public void applyBrake() {
		System.out.println("Apply the Break");
	}
	
	public void soundHorn() {
		System.out.println("Apply horn in turning");
	}
	
	public void isPuncture() {
		System.out.println("The tyre is puncture");
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car vehicle = new Car();
		
		vehicle.driveCar();
		vehicle.applyBrake();
		vehicle.soundHorn();
		vehicle.isPuncture();
		
	}

}
