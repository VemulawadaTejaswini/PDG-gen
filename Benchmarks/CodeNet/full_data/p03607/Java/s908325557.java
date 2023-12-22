import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		if(N == 1) {
			System.out.println(1);
			return;
		}
		int[] A = new int[N];
		int ans = 0;
		for(int i = 0; i < N; i++) {
			A[i] = sc.nextInt();
		}
		Arrays.sort(A);
		int a = 1;
		for(int i = 1; i < N; i++) {
			if(A[i] == A[i-1]) {
				a += 1;
				if(i == N-1)
					ans += a % 2;
			}
			else {
				ans += a % 2;
				a = 1;
			}
		}
		System.out.println(ans);
	}

}