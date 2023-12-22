

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner  = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] x = new int[n];
		int[] y = new int[n - 1];
		int[] b = new int[n];
		for (int i = 0; i < n; i++) {
			x[i] = scanner.nextInt();
		}
		scanner.close();
		int k =0;
		for (int i = 0; i < n; i++) {
			k = 0;
			for (int j = 0; j < n; j++) {
				if (i != j) {
					y[k] = x[j];
					k++;
				}
				
			}
			Arrays.sort(y);
			b[i] = y[(n - 1)  / 2];
			System.out.println(b[i]);
		}
		
		
		
		

	}

}
