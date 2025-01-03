package jsp.Collection;

public class Daughter extends Inheritance{
	
	public Daughter(double money, String scooter) {
		super(money, null, null, scooter);
		this.money=money;
		this.scooter=scooter;
	}

	public void daughterDetails() {
		System.out.println("daughter's details-------");
		System.out.println(money);
		System.out.println(scooter);
	}

}
