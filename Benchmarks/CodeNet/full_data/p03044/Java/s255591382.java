import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		int[] u = new int[N - 1];
		int[] v = new int[N - 1];
		int[] w = new int[N - 1];
		
		for(int i = 0; i < N - 1; i++) {
			u[i] = sc.nextInt();
			v[i] = sc.nextInt();
			w[i] = sc.nextInt();
		}
		
		int[] x = new int[N + 1];
		Arrays.fill(x, 2);
		
		for(int i = 0; i < N - 1; i++) {
			if(w[i] % 2 == 0) {
				if(x[u[i]] == 2 && x[v[i]] == 2) {
					x[u[i]] = 0;
					x[v[i]] = x[u[i]];
				} else if(x[u[i]] != 2 && x[v[i]] == 2) {
					x[v[i]] = x[u[i]];
				} else if(x[u[i]] == 2 && x[v[i]] != 2) {
					x[u[i]] = x[v[i]];
				} 
			} else {
				x[u[i]] = 0;
				x[v[i]] = 0;
			}
		}
		for(int i = 1; i <= N; i++) {
			if(x[i] == 2) {
				x[i] = 0;
			}
			System.out.println(x[i]);
		}
	}
}
