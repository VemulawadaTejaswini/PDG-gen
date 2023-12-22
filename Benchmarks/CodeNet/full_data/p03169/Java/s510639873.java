import java.util.Arrays;
import java.util.Scanner;

public class sushitopcoder {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		n=scan.nextInt();
		int[] f=new int[4];
		for(int i=0;i<n;i++) {
			f[scan.nextInt()]++;
		}
		dp=new double[301][301][301];
		for(double[][] d:dp) for(double[] dd:d) Arrays.fill(dd,-1);
		System.out.println(go(f[1],f[2],f[3]));
	}
	static double[][][] dp;
	static int n;
	
	public static double go(int f1, int f2, int f3) {
		int rem=f1+f2+f3;
		if(rem==0) return 0;
		
		if(dp[f1][f2][f3]!=-1) return dp[f1][f2][f3];
		
		double res=0;
		res+=n*1.0/(f1+f2+f3);
		
		if(f1>0) res+=f1*1.0/rem*go(f1-1,f2,f3);
		if(f2>0) res+=f2*1.0/rem*go(f1+1,f2-1,f3);
		if(f3>0) res+=f3*1.0/rem*go(f1,f2+1,f3-1);
		
		return dp[f1][f2][f3]=res;
	}
}