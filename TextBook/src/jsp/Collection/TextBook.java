package jsp.Collection;

public class TextBook {
	int id;
	String title;
	String author;
	int edition;
	double price;
	public TextBook(int id, String title, String author, int edition, double price) {
		super();
		this.id = id;
		this.title = title;
		this.author = author;
		this.edition = edition;
		this.price = price;
	}
	
//	toString ()---> IT PROVIDE ATTRIBUTES OF OBJECT
	public String toString() {         
//		return "TextBook interface";
		return " "+this.id+","+this.title+","+this.author+","+this.edition+","+this.price;
	}
	

}
