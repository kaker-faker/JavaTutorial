package tutorial18;

class Machine {
	private String name;
	private int code;
	
	public Machine() {
		this("Arnie", 0);
		System.out.println("Constructor running");
	}
	
	public Machine(String name) {
		this.name = name;
		System.out.println("Second constructor");
	}
	
	public Machine(String name, int code) {
		this.name = name;
		this.code = code;
		System.out.println("Third constructor");
	}
}
public class App {
	public static void main(String[] args) {
		Machine machine1 = new Machine();
		Machine machine2 = new Machine("Burt");
		Machine machine3 = new Machine("Chalky", 7);
	}
}
