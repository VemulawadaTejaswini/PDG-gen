import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] x = new int[3];
		x[0] = sc.nextInt();
		x[1] = sc.nextInt();
		x[2] = sc.nextInt();
		
		Arrays.sort(x);
		
		int d1 = x[2] - x[0];
		int d2 = x[2] - x[1];
		int min = 10000;
		
		if(d1 % 2 == 0 && d2 % 2 == 0) {
			min = d1 / 2 + d2 / 2;
		} else if(d1 % 2 == 1 && d2 % 2 == 1) {
			min = (d1 - 1) / 2 + (d2 - 1) / 2 + 1;
		} else if(d1 % 2 == 0 && d2 % 2 == 1) {
			min = d1 / 2 + (d2 - 1) / 2 + 2;
		} else {
			min = (d1 - 1) / 2 + d2 / 2 + 2;
		}
		System.out.println(min);
	}
}
