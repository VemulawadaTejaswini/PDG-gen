import java.io.*;
import java.math.*;
import java.util.*;
public class Main {
 
	public static void main(String[] args) { 
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();
		int K = input.nextInt();
		double[] p = new double[N];
		double[] exp = new double[N];
		double ans = 0.0;
		for (int i = 0; i < N; i++) {
			p[i] = input.nextDouble();
			exp[i] = (p[i]+1)*p[i]/2/p[i];
		}
		double StartSum = 0.0;
		for (int i = 0; i < K; i++) {
			StartSum+=exp[i];
		}
		ans=Math.max(ans, StartSum);
		for (int i = 1; i+K<=N; i++) {
			StartSum-=exp[i-1];
			StartSum+=exp[i+K-1];
			ans=Math.max(ans, StartSum);
		}
		System.out.println(ans);
	}	
}