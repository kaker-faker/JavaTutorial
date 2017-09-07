package tutorial06;

public class App {
	public static void main(String[] args) {
		int myInt = 5;
		
		if(myInt < 10) {
			System.out.println("Less than 10");
		} 
		else if(myInt < 20) {
			System.out.println("Greater than or equal to 10 but Less than 20");
		}
		else {
			System.out.println("None of the above");
		}
		
		int loop = 0;
		
		//while(loop < 5) {
		while(true) {
			System.out.println("Looping: " + loop);
			loop++;
			if(loop == 5) {
				break;
			}
		}
	}
}
