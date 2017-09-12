package tutorial15;

class Person {
	String name;
	int age;
	
	void speak() {
		System.out.println("My name is " + name);
	}
	
	int calculateYearsToRetirement() {
		int yearsLeft = 65 - age;

		return yearsLeft;
	}
	
	int getAge() {
		return age;
	}
	
	String getName() {
		return name;
	}
}

public class App {
	public static void main(String[] args) {
		Person person1 = new Person();
		person1.name = "Joe";
		person1.age = 25;
		person1.speak();
		System.out.println(person1.calculateYearsToRetirement());
		
		int age = person1.getAge();
		System.out.println(age);
		String name = person1.getName();
		System.out.println(name);
	}
}
