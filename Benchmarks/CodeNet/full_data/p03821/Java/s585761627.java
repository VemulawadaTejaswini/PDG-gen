import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long[] A = new long[N];
		long[] B = new long[N];
		for(int i=0; i<N; i++) {
			A[i] = sc.nextInt();
			B[i] = sc.nextInt();
		}
		
		long ans = 0;
		
		for(int i=N-1; i>=0; i--) {
			long push = B[i] - (A[i]+ans)%B[i];
			if(push==B[i])
				push = 0;
			ans += push;
		}
		
		System.out.println(ans);
		sc.close();
	}
}
