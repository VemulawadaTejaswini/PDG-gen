import java.util.*;
import java.lang.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		double[] v = new double[N];
		for( int i=0; i<N; i++ ){
			v[i] = sc.nextDouble();
		}
		Arrays.sort(v);
		for( int i=1; i<N; i++ ){
			v[i] = (v[i]+v[i-1])/2;
		}
		System.out.println(v[N-1]);
	}
}
