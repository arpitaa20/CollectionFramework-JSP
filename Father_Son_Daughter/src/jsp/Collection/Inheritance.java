package jsp.Collection;

/* QUESTION:
 * Father --> have money, bike, car, scooter
 * Son ---> have all properties
 * Daughter --> all except bike & car */
class Inheritance {
//	father class
	public double money;
	String bike;
	String car;
	public String scooter;
	
	public Inheritance(double money, String bike, String car, String scooter) {
		super();
		this.money = money;
		this.bike = bike;
		this.car = car;
		this.scooter = scooter;
	}
}
