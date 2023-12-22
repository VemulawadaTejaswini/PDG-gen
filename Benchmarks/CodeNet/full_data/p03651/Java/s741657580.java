import java.util.*;
public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		int A[] = new int[N];
		int num = 0;
		int max = 0;
		for(int i = 0; i < N; i++) {
			A[i] = sc.nextInt();
			max = Math.max(max, A[i]);
			if(i == 0) {
				num = A[0];
			} else {
				num = gcd(num, A[i]);
			}
		}
		
		if(K % num == 0 && K <= max) {
			System.out.println("POSSIBLE");
		} else {
			System.out.println("IMPOSSIBLE");
		}
	}

	static int gcd (int a, int b) {
		return b > 0 ? gcd(b, a % b) : a;
	}
}
