
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] array = new int[6];
		for(int i =0; i < array.length; i++)
			array[i] = sc.nextInt();
		
		for(int i = 0; i < 5; i++) {
			for(int j = i+1; j < 5; j++) {
				if(array[j] - array[i] > array[array.length-1]) {
					System.out.println(":(");
					return;
				}
			}
		}
		System.out.println("Yay!");
	}
}