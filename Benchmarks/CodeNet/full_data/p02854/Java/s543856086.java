import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long A[] = new long[N];
		for(int i=0;i<N;i++)A[i]=sc.nextLong();
		sc.close();
		
		//累積和
		long v[] = new long[N+1];
		for(int i=0;i<N;i++) {
			v[i+1]=v[i]+A[i];
		}
		
		long sum = v[N];
		
		long ans = Long.MAX_VALUE;
		for(int i=0;i<N+1;i++) {
			long tmp = Math.abs(v[i]*2-sum);
			ans = Math.min(ans, tmp);
		}
	
		System.out.println(ans);
		
	}

}
