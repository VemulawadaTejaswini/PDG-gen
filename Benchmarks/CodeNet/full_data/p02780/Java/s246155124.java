import java.util.*;
import java.lang.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int K = sc.nextInt();
		double[] p = new double[N];
		for( int i=0; i<N; i++ ){
			p[i] = sc.nextDouble();
			p[i] = (p[i]+1)/2;
		}
		int count = 0;
		double[] ans = new double[N-K+1];
		for( int i=0; i<K; i++ ){
			ans[0] += p[i];
		}
		for( int i=K; i<N; i++ ){
			count++;
			ans[count] = ans[count-1]+p[i]-p[i-K];
		}
		Arrays.sort(ans);
		System.out.println(ans[N-K]);     
	}
}
