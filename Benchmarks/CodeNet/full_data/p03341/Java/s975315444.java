import java.util.*;
import java.lang.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		String S = sc.next();
		int countE = 0,countW = 0;
		int[] E = new int[N];
		int[] W = new int[N];
		int[] ans = new int[N];
		for( int i=0; i<N; i++ ){
			if( S.charAt(i)=='E' ){
				countE++;
				E[i] = countE;
				W[i] = countW;
			}else{
				countW++;
				W[i] = countW;
				E[i] = countE;
			}
		}
		for( int i=1; i<N-1; i++ ){
			if( S.charAt(i)=='E' ){
				ans[i] = W[i] + ( E[N-1] - E[i] );
			}
			if( S.charAt(i)=='W' ){
				ans[i] = W[i-1] + ( E[N-1] - E[i] );
			}
		}
		if( S.charAt(0)=='E' ){
			ans[0] = E[N-1] - 1;
		}else{
			ans[0] = E[N-1];
		}
		if( S.charAt(N-1)=='W' ){
			ans[N-1] = W[N-1] - 1;
		}else{
			ans[N-1] = W[N-1];
		}
		Arrays.sort(ans);
		System.out.println(ans[0]);
	}
}
