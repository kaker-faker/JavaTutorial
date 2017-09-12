package tutorial16;

class Robot {
	public void speak(String text) {
		System.out.println(text);
	}
	
	public void jump(int height) {
		System.out.println("Jumping: " + height);
	}
	
	public void move(String direction, double distance) {
		System.out.println("Moving " + distance + " meters " + direction);
	}
}

public class App {
	public static void main(String[] args) {
		Robot sam = new Robot();
		sam.jump(7);
		sam.move("West", 5.2);
		
		String greeting = "Hello there";
		sam.speak(greeting);
		
	}
}