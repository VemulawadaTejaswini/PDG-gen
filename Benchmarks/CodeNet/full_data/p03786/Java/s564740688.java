import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int[] A = new int[N];
		for(int i=0; i<N; i++)
			A[i] = sc.nextInt();
		Arrays.sort(A);
		long[] sum = new long[N];
		for(int i=0; i<N; i++)
			sum[i] = (i>0 ? sum[i-1] : 0) + A[i];
		
		int ans = 0;
		for(int i=N-2; i>=0; i--) {
			if(sum[i]*2 < A[i+1]) {
				ans = i+1;
				break;
			}
		}
	
		System.out.println(N-ans);
		sc.close();
	}
}