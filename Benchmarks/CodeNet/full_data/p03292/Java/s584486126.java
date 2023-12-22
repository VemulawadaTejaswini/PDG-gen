import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] array = new int[3];
		for(int i = 0; i < array.length; i++)
			array[i] = sc.nextInt();
		Arrays.sort(array);
		int cost = 0;
		for(int i = 0; i < array.length-1; i++) 
			cost += Math.abs(array[i] - array[i+1]);
		System.out.println(cost);
	}
}
