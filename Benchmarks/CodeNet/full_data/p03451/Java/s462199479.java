import java.util.*;
import java.lang.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int[][] A = new int[2][N+1];
		int[] t0 = new int[N+1];
		int[] t1 = new int[N+1];
		int[] ans = new ans[N+1];
		int total0 = 0,total1 = 0;
		for( int i=1; i<=N; i++ ){
			A[0][i] = sc.nextInt();
			total0 += A[0][i];
			t0[i] = total0;
		}
		for( int i=1; i<=N; i++ ){
			A[1][i] = sc.nextInt();
		}
		for( int i=N; i>=1; i-- ){
			total1 += A[1][i];
			t1[i] = total1;
		}
		for( int i=1; i<=N; i++ ){
			ans[i] = t0[i] + t1[i];
		}
		Arrays.sort(ans);
		System.out.println(ans[N]);
	}
}
