import java.util.*;
public class Main {
	
	static int mod = (int)1e9+7;
	
	public static void main(String[] args) {		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int A[] = new int[N+1];
		int B[] = new int[N];
		for(int i=0;i<N+1;i++)A[i]=sc.nextInt();
		for(int i=0;i<N;i++)B[i]=sc.nextInt();
		sc.close();
		int ans = 0;
		for(int i=0;i<N;i++) {
			if(B[i]>A[i]) {
				ans += A[i];
				//余力で次の町
				int nextBase = A[i+1];
				A[i+1]=Math.max(0, A[i+1]-(B[i]-A[i]));
				ans += nextBase - A[i+1];
			}else {
				ans += B[i];
			}
		}
		System.out.println(ans);
	}
}