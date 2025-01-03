package jsp.Collection;

public class Book_Coding_related {

	public static void main(String[] args) {
		
		System.out.println("---------------------");
		
		TextBook[] tb= new TextBook[5];
		
		tb[0] = new TextBook(231,"JAVA","Pavan",2,250.00);
		tb[1] = new TextBook(232,"SQL","Sarath",3,450.00);
		tb[2] = new TextBook(233,"LP","Sameer",4,550.00);
		tb[3] = new TextBook(234,"DSA","Darshan",5,650.00);
		tb[4] = new TextBook(235,"Apti","Yadav",6,750.00);
		
		System.out.println("Book - Coding_related");
		System.out.println("---------------------------------------");
		System.out.println("Id\tTitle\tAuthor\tEdition\tPrice");
		System.out.println("---------------------------------------");
		for(int i=0; i<tb.length; i++) {
			
			if(tb[i].title.equalsIgnoreCase("java") || tb[i].title.equalsIgnoreCase("lp") || tb[i].title.equalsIgnoreCase("dsa")){
			System.out.println(tb[i].id+ "\t" +tb[i].title +"\t"+ tb[i].author +"\t"+ tb[i].edition+"\t"+tb[i].price);
			}
		}
		System.out.println("------------------------");
	}
}
