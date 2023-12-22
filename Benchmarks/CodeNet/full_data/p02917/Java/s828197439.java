import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		int[] B = new int[N-1];
		for (int i=0;i<N-1;i++) {
			B[i] = Integer.parseInt(sc.next());
		}
		int ans = 0;
		ans += B[0];
		for (int i=0;i<N-2;i++) {
			ans += Math.min(B[i], B[i+1]);
		}
		ans += B[N-2];
		System.out.println(ans);
	}
}