

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[]a = new int[n];
		
		//3 5 6 11 31
		int j = 0;
		int cnt = 2;
		while (j < n) {
			a[j] = (5 * cnt) + 1;
			if (a[j] % 2 != 0 && a[j] % 3 != 0 && a[j] % 4 != 0) {
				j++;
			}
			cnt++;
			
		}
		
		
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]);
			if (i + 1 <a.length) {
				System.out.print(" ");
			}
		}
		System.out.println();
		scanner.close();

	}
	


}
