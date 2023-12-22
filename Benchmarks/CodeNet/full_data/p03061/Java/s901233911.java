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
			if(N == 2) {
				System.out.println(Math.max(A[0], A[1]));
				return;
			}
			int start = 0, end = N;
			while(true) {
				int gcd1 = A[0], gcd2 = A[(N+1)/2];
				for(int i = start; i < (end+1)/2; i++)
					gcd1 = gcd(gcd1,A[i]);
				for(int i = (end+1)/2; i < end; i++)
					gcd2 = gcd(gcd2,A[i]);
				if(gcd1 > gcd2)
					start = (end+1)/2 + 1;
				else if(gcd1 < gcd2)
					end = (end+1)/2;
				else {
					ans = gcd1;
					break;
				}
				if(end - 1 - start <= 1) {
					ans = Math.max(gcd(Math.max(gcd1, gcd2), A[start]),gcd(Math.max(gcd1, gcd2), A[end-1]));
					break;
				}
			}
			System.out.println(ans);
		}

	}