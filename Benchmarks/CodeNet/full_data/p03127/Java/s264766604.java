import java.util.Arrays;
import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);
	static int N = Integer.parseInt(sc.next());
	static int[] A = new int[N];
	static {
		Arrays.setAll(A, i -> Integer.parseInt(sc.next()));
	}
	public static void main(String[] args) {
		int ans = gcd(A[0], A[1]);
		for (int i = 2; i < N; i++) {
			ans = gcd(ans, A[i]);
		}
		System.out.println(ans);
	}
    private static int gcd(int m, int n) {
        if(m < n) return gcd(n, m);
        if(n == 0) return m;
        return gcd(n, m % n);
    }
}