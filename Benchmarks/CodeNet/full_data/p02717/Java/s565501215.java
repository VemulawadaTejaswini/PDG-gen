import java.util.Arrays;
import java.util.Scanner;

public class Main {
	
	static void swap(Integer[] array, int a, int  b) {
		int temp = array[a];
		array[a] = array[b];
		array[b] = temp;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		Integer[] array = new Integer[3];
		
		for (int i = 0; i < 3; i++) {
			array[i] = new Integer(scanner.nextInt());
		}
		
		swap(array, 0, 1);
		swap(array, 0, 2);
		
		
		System.out.println(array[0] + " " + array[1] + " " + array[2]);
	}

}
