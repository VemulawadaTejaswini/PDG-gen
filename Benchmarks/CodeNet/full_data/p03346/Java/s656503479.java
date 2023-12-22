import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = Long.parseLong(sc.next());
		long[] p = new long[(int)n];
		for (int i = 0; i < n; i++)
			p[i] = Long.parseLong(sc.next());
		long max = 0;
		/*for (int i = 1; i <= n; i++) {
			int j = i;
			boolean b = false;
			for (int k = 0; k < n; k++) {
				if (p[k] == i - 1 && !b) break;
				if (p[k] == j) {
					b = true;
					j++;
				}
			}
			max = Math.max(max, j - i + 1);
		}*/
		long i = 1;
		for (int j = 0; j < n; j++) {
			if (p[j] == i)
				i++;
		}
		max = Math.max(max, i);
		i = n;
		for (int j =  (int)n - 1; j >= 0; j--) {
			if (p[j] == i)
				i--;
		}
		max = Math.max(max, n - i + 1);
		System.out.println(n - max + 1);
	}
}