package tutorial10;

public class App {
	public static void main(String[] args) {
		int[] values;
		values = new int[3];
		
		System.out.println(values[0]);
		
		for(int i = 0; i < values.length; i++) {
			values[i] = i * 10 + 10;
			System.out.println(values[i]);
		}
		
		int[] numbers = {5, 6, 7};
		
		for(int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}
	}
}
