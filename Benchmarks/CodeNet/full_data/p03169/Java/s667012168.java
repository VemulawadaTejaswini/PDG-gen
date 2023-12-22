
import java.util.Scanner;
import java.util.Vector;

public class Main {
	static double dp[][][];
	static int n;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		int t[] = new int[3];
		for (int i=0;i<n;i++) 
			t[sc.nextInt()-1]+=1;	
		
		dp = new double[n+1][n+1][n+1];
		
		
		double ans = f(t[2],t[1],t[0]);
		System.out.println(ans);
		

	}
	private static double f(int t3, int t2, int t1) {
		if (t3 ==0 && t2 ==0&& t1 ==0) return 0;
		if (dp[t3][t2][t1] > 0) return dp[t3][t2][t1];
		double r = 0;
		if (t3>0) r += t3*f(t3-1,t2+1,t1);
		if (t2>0) r += t2*f(t3,t2-1,t1+1);
		if (t1>0) r += t1*f(t3,t2,t1-1);
		r +=n;
		r /=(t1+t2+t3);
		dp[t3][t2][t1] = r;
		return r;
	}
}
