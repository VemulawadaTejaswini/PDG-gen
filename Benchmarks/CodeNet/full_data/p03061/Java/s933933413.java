import java.util.*;
public class Main {
		
		public static int gcd(int a, int b) {
			return b == 0 ? a: gcd(b, a % b);
		}

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int N = sc.nextInt();
			int[] A = new int[N];
			int ans = 0;
			for(int i = 0; i < N; i++)
				A[i] = Integer.parseInt(sc.next());
			int[] L = new int[N+1];
			int[] R = new int[N+1];
			for(int i = 0; i < N; i++)
				L[i+1] = gcd(L[i],A[i]);
			for(int i = N-1; i > 0; i--)
				R[i] = gcd(R[i+1], A[i]);
			for(int i = 0; i < N; i++)
				ans = Math.max(ans, gcd(L[i],R[i+1]));
			System.out.println(ans);
		}

	}
