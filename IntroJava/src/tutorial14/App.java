package tutorial14;

class Person {
	String name;
	int age;
	
	void speak() {
		System.out.println("My name is: " + name + " and I am " + age + " years old.");
	}
}
public class App {
	public static void main(String[] args) {
		Person person1 = new Person();
		person1.name = "Joe Boggs";
		person1.age = 37;
		
		Person person2 = new Person();
		person2.name = "Sarah Smith";
		person2.age = 20;
		
		person1.speak();
	}

}
