import java.util.Scanner;

public class Main {
	public static void main(String[]args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();

		int[] a = new int[n];
		int[] b = new int[n];
		int[] c = new int[n];
		
		for(int i = 0; i < n; i++) {
			s.nextLine();
			a[i] = s.nextInt();
			b[i] = s.nextInt();
			c[i] = s.nextInt();
		}
		
		int[] prevDayA = new int[n];
		int[] prevDayB = new int[n];
		int[] prevDayC = new int[n];
		
		prevDayA[0] = a[0];
		prevDayB[0] = b[0];
		prevDayC[0] = c[0];
		// addd case for 0
		for(int i = 1; i < n; i++) {
			prevDayA[i] = Math.max(prevDayB[i], prevDayC[i]) + a[i];
			prevDayB[i] = Math.max(prevDayA[i], prevDayC[i]) + b[i];
			prevDayC[i] = Math.max(prevDayA[i], prevDayB[i]) + c[i];
		}
		
		System.out.println(Math.max(prevDayA[n-1], Math.max(prevDayB[n-1], prevDayC[n-1])));
		
	}
}
