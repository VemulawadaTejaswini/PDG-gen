import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] t = new int[n+1];
		int[] x = new int[n+1];
		int[] y = new int[n+1];
		t[0]=0; x[0]=0; y[0]=0;
		for (int i = 1; i <= n; i++) {
			t[i] = sc.nextInt();
			x[i] = sc.nextInt();
			y[i] = sc.nextInt();
		}
		for(int i = 1; i <= n; i++) {
			int tsa = t[i] - t[i-1];
			int kyori = Math.abs(x[i]-x[i-1])+Math.abs(y[i]-y[i-1]);
			int hikaku = tsa - kyori;
			if(hikaku >= 0 && hikaku % 2 == 0) {
			} else {
				System.out.println("No");
				return;
			}
		}
		System.out.println("Yes");
	}
}