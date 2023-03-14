public class Driver extends Car{
	
	public void drive() {
		gas -= 1;
		System.out.println("You Drive the Car");
		System.out.println(String.format("Gas remaining: %s", status()));
	}
	public void boost() {
		gas -= 3;
		System.out.println("You Boost the Car");
		System.out.println(String.format("Gas remaining: %s", status()));
	}
	public void refuel() {
		gas += 2;
		System.out.println("You Refuel the Car");
		System.out.println(String.format("Gas remaining: %s", status()));
	}
}
 
