package jsp.Collection;

public class Driver {

	public static void main(String[] args) {		
		Son son=new Son(50000.00,"GT","BMW","Activa");
		son.displayDetails();
		
		Daughter daughter = new Daughter(50000.00,"Activa");
		daughter.daughterDetails();
		
	}

}
