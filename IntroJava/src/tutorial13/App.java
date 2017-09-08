package tutorial13;

//Classes can contain
//1. data
//2. subroutines (methods)
class Person {
	//instance variables
	String name;
	int age;
}

public class App {
	public static void main(String[] args) {
		Person person1 = new Person();
		person1.name = "Joe";
		person1.age = 37;
		
		Person person2 = new Person();
		person2.name = "Sarah Smith";
		person2.age = 20;
		
		System.out.println(person1.name);
		System.out.println(person2.name);
	}

}
