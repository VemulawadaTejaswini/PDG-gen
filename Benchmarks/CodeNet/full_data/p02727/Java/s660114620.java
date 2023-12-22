import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		long[] p = new long[a];
		long[] q = new long[b];
		long[] r = new long[c];
		
		Arrays.setAll(p, i -> sc.nextLong());
		Arrays.setAll(q, i -> sc.nextLong());
		Arrays.setAll(r, i -> sc.nextLong());
		
		Arrays.sort(p);
		Arrays.sort(q);
		Arrays.sort(r);
		
		long sum = 0;
		int idxX = a - 1;
		int idxR = c - 1;
		for (int i = 0; i < x; i++) {
			if (idxR >= 0 && p[idxX] < r[idxR]) {
				sum += r[idxR--];
			} else {
				sum += p[idxX--];
			}
		}
		
		int idxY = b - 1;
		for (int i = 0; i < y; i++) {
			if (idxR >= 0 && q[idxY] < r[idxR]) {
				sum += r[idxR--];
			} else {
				sum += q[idxY--];
			}
		}
		
		System.out.println(sum);
		
		sc.close();
	}
}
