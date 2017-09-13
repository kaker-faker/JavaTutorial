package tutorial19;

class Thing {
	public final static int LUCKY_NUMBER = 7;
	
	public String name;
	public static String description;
	public int id;
	
	public static int count = 0;
	
	public Thing() {
		count++;
		this.id = count;
	}
	public void showName() {
		System.out.println(name);
	}
	
	public static void showInfo() {
		System.out.println(description);
		
	}
}
public class App {
	public static void main(String[] args) {
		Thing.description = "I am a thing";
		
		System.out.println(Thing.count);
		
		Thing thing1 = new Thing();
		Thing thing2 = new Thing();
		thing1.name = "Bob";
		thing2.name = "Sue";
		System.out.println(thing1.name);
		System.out.println(thing2.name);
		System.out.println(thing1.id);
		System.out.println(thing2.id);
		
		thing1.showName();
		thing2.showName();
		Thing.showInfo();
		System.out.println(Thing.count);
	}
}
