package tutorial17;

class Frog {
	private String name;
	private int age;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
}
public class App {
	public static void main(String[] args) {
		Frog frog1 = new Frog();
		frog1.setAge(1);
		frog1.setName("Bertie");
		System.out.println(frog1.getAge());
		System.out.println(frog1.getName());
	}
}
