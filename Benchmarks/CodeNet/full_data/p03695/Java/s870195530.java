import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] c = new int[9];
		
		for (int i = 0; i < N; i++) {
			int n = sc.nextInt();
			c[Math.min(n / 400, 8)]++;
		}
		
		int min = 0;
		for (int i = 0; i < 8; i++) {
			if (c[i] != 0) {
				min++;
			}
		}
		int max = Math.min(8, min + c[8]);
		System.out.println(min + " " + max);
	}
}
