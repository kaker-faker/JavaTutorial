package tutorial31;
import java.util.ArrayList;

class Machine {
	public String toString() {
		return "I am a machine.";
	}
	
	public void start() {
		System.out.println("System started");
	}
}

class Camera extends Machine {
	
}

public class Tutorial31 {

	public static void main(String[] args) {
		ArrayList<Machine> list = new ArrayList<Machine>();
		
		list.add(new Machine());
		list.add(new Machine());
		
		ArrayList<Camera> list2 = new ArrayList<Camera>();
		
		list2.add(new Camera());
		list2.add(new Camera());
		
		showList(list2);
	}
	
	public static void showList(ArrayList<? super Camera> list) {
		for(Object value: list){
			System.out.println(value);
		}
		
		
	}

}
