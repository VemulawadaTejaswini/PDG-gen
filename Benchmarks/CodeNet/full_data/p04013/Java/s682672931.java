import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		int a = Integer.parseInt(sc.next());
		int[] x = new int[n];
		for (int i = 0; i < n; i++)
			x[i] = Integer.parseInt(sc.next());
		long ans = 0;
		int digits = n;
		for(int i = 0; i < (1<<digits); i++) {
			int c = 0;
			double t = 0;
			for(int j = digits-1, k = 0; j >= 0; j--, k++) {
				if(((i>>j) & 1) == 1) {
					t += x[k];
					c++;
				}
			}
			if (t / c == a)
				ans++;
		}
		System.out.println(ans);
	}
}