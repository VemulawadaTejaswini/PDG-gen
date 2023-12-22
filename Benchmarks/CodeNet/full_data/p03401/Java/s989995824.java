
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] a = new int[n];
		int min = 5000;
		int max = 0;
		int[] ans = new int[n]; 
		//|a-b|円?
		for (int i = 0; i < n; i++) {
			a[i] = scanner.nextInt();
			
		}
		scanner.close();
		for (int i = 0; i < n; i++) {
			min = 5000;
			max = 0;
			for (int j = 0; j < n; j++) {
				if (i != j) {
					min = Math.min(min, a[j]);
					max = Math.max(max, a[j]);
				}
			}
			if (min > 0) {
				min = 0;
			}
			ans[i] = Math.abs(max - min) * 2;
		}
		for (int ap: ans) {
			System.out.println(ap);
		}
		

	}

}
