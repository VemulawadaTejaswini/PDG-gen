
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < a.length; i++) {
			a[i]  = sc.nextInt();
		}
		
		int max = 0;
		int sum = 0;
		int cnt = 0;
		for (int i = 0; i < a.length; i++) {
			sum += a[i];
			cnt++;
			if (cnt == k) {
				max = Math.max(max, sum);
				cnt = 0;
				sum = 0;
				i = i - k + 1;
			}
		}
		System.out.println((max - k) * 0.5 + k);
	}
}


