import java.util.*;
import java.lang.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int[] A = new int[N];
		long[] countA = new long[N+1];
		long[] plus = new long[N+1];
		long[] minus = new long[N+1];
		for( int i=0; i<N; i++ ){
			A[i] = sc.nextInt();
			countA[ A[i] ]++;
		}
		long total = 0;      
		for( int i=1; i<=N; i++ ){
			if( countA[i]>1 ){
				plus[i] = countA[i]*(countA[i-1])/2;
				minus[i] = (countA[i]-1)*(countA[i]-2)/2;
				total += plus[i];
			}
		}     
		for( int i=0; i<N; i++ ){
			System.out.println( total - plus[A[i]] + minus[A[i]] );
		}    
	}
}