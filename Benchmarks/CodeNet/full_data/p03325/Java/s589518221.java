
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
				for (int j = 2; ; j *= 2) {
					if (a[i] % j == 0) {
						sum++;
					} else {
						break;
					}
				}
		}
		System.out.println(sum);
	}
}
