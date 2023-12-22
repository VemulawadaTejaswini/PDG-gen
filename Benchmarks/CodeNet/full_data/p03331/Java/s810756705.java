import java.util.Scanner;

public class Main {

	private void solve() {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int min = Integer.MAX_VALUE;
		for(int i=1; i<N; i++) {
			int A = i;
			int B = N-i;
			int sum = 0;
			while(A>0) {
				sum += A % 10;
				A /= 10;
			}
			while(B>0) {
				sum += B % 10;
				B /= 10;
			}
			min = Math.min(min, sum);
		}
		System.out.println(min);
	}

	public static void main(String[] args) {
		new Main().solve();
	}
}