import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] W = new int[N];
		
		for(int i = 0; i < N; i++) {
			int x = sc.nextInt();
			if(i > 0) {
				W[i] = W[i - 1] + x;
			} else {
				W[i] = x;
			}
		}
		
		int ans = 100000;
		
		for(int i = 0; i < N - 1; i++) {
			ans = Math.min(ans, Math.abs(W[N - 1] - 2 * W[i]));
		}
		
		System.out.println(ans);
	}
}
