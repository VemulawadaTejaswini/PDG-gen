import java.util.Scanner;
import java.util.Arrays;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] d = new int[k];

		for (int i = 0; i < k; i++) {
			d[i] = sc.nextInt();
			System.out.println(d[i]);
		}

		boolean found = false;
		int i;
		for (i = n; !found; i++) {
			System.out.println("---" + i);
			if (noDigits(d, i)) 
				found = true;

		}
		System.out.println(--i);
	}

	public static boolean noDigits(int[] d, int num) {
		while (num != 0) {
			int dig = num % 10;
			System.out.println(dig + "\t" + num);

			for (int i = 0; i < d.length; i++) {
				if (d[i] == dig) return false;
			}
			num /= 10;
		}
		return true;
	}
}