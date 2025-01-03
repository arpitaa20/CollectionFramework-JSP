package jsp.Collection;

public class Son extends Inheritance{
	
	public Son(double money, String bike, String car, String scooter) {
		super(money, bike, car, scooter);
	}

	public void displayDetails() {
		System.out.println("son's property------");
		System.out.println(money);
		System.out.println(bike);
		System.out.println(car);
		System.out.println(scooter);
	}

}
