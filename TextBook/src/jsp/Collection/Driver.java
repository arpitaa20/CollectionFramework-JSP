package jsp.Collection;

public class Driver {

	public static void main(String[] args) {
		System.out.println("------------------------");
		
		TextBook[] tb = new TextBook[5];
		
		tb[0] = new TextBook(231,"JAVA","Pavan",2,250.00);
		tb[1] = new TextBook(232,"SQL","Sarath",3,450.00);
		tb[2] = new TextBook(233,"LP","Sameer",4,550.00);
		tb[3] = new TextBook(234,"DSA","Darshan",5,650.00);
		tb[4] = new TextBook(235,"Apti","Yadav",6,750.00);
		
		System.out.println("Array size : "+ tb.length);
		
		
//		provide only address of the object
		System.out.println("Elements of Array");
		for(int i=0; i<tb.length; i++) {
			System.out.println(tb[i]);
		}
		System.out.println("--------------------------");
		
		

	}

}
