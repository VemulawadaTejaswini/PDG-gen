import java.util.*;
import java.lang.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int K = sc.nextInt();
		long[] A = new long[N];
		int minus = 0;
		int plus = 0;
		int zero = 0;
		for( int i=0; i<N; i++ ){
			A[i] = sc.nextLong();
			if( A[i]>0 ){
				plus++;
			}
			if( A[i]<0 ){
				minus++;
			}
			if( A[i]==0 ){
				zero++;
			}
		}
		Arrays.sort(A);
		int countMinus = plus*minus;
		int countZero = zero*(N-zero);
		int countPlus = (N*(N-1)/2) - countMinus - countZero;
		if( K<=countMinus ){
			System.out.println(A[K/plus]*A[N - (plus-(K%plus))]);
		}
		if( K>countMinus && K<=countMinus+countZero ){
			System.out.println("0");
		}
		if( K>countMinus+countZero ){
          
        }          
	}
}