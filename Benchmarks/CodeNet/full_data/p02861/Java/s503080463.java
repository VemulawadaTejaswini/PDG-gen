import java.util.*;
import java.lang.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		double[] x = new double[N];
		double[] y = new double[N];
		double[] ans = new double[40320];
		double[] aa = new double[]{1,2,4,8,16,32,64,128,256};
		double[] bb = new double[]{0,1,2,6,24,120,720,5040,40320};
		for( int i=0; i<N; i++ ){
			x[i] = sc.nextDouble();
			y[i] = sc.nextDouble();
		}
		int count = 0;
		for( int i=0; i<=N-2; i++ ){
			for( int k=i+1; k<=N-1; k++ ){
				ans[count] = Math.sqrt( (x[i]-x[k])*(x[i]-x[k])+(y[i]-y[k])*(y[i]-y[k]) );
				count++;
			}
		}
		double total = 0;
		for( int i=0; i<40320; i++ ){
			total += ans[i];
		}
		System.out.println(total*aa[N-1]/bb[N]/2);
	}
}
