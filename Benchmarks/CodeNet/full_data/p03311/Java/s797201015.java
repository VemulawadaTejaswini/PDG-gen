import java.util.*;
import java.lang.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		long[] A = new long[N+1];
		int countP=0,countM=0,countZ=0;
		long minP = 1000000000L,minM = 1000000000L;
		long cc = 0,dd = 0;
		for( int i=1; i<=N; i++ ){
			cc++;
			A[i] = sc.nextLong();
			if( A[i]>cc ){
				countP++;
				minP = Math.min(minP,Math.abs(A[i]-cc));
			}
			if( A[i]<cc ){
				countM++;
				minM = Math.min(minM,Math.abs(A[i]-cc));
			}
			if( A[i]==cc ){
				countZ++;
			}
		}
		long b = 0,ans = 0;
		if( countP>countM+countZ ){
			b = minP;
		}else if( countM>countP+countZ ){
			b = minM*(-1);
		}else{
			b = 0;
		}
		for( int i=1; i<=N; i++ ){
			dd++;
			ans += Math.abs( A[i]-(b+dd) );
		}
		System.out.println(ans);
	}
}
