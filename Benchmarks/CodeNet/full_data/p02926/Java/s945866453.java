import java.util.*;
public class Main {

	public static class dynamic{
		double x = 0, y = 0, d = 0;
		dynamic(double x, double y, double d){
			this.x = x;
			this.y = y;
			this.d = d;
		}
		double getx() {
			return x;
		}
		double gety() {
			return y;
		}
		double getd() {
			return d;
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] x = new int[N];
		int[] y = new int[N];
		for(int i = 0; i < N; i++) {
			x[i] = sc.nextInt();
			y[i] = sc.nextInt();
		}
		double ans = 0;
		dynamic[][] dp = new dynamic[4][N+1];
		for(int i = 0; i < 4; i++)
			dp[i][0] = new dynamic(0, 0, 0);
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < 4; j++) {
				dp[j][i+1] = dp[j][i];
			}
			double x0 = dp[0][i].getx();
			double y0 = dp[0][i].gety();
			double x1 = dp[1][i].getx();
			double y1 = dp[1][i].gety();
			double x2 = dp[2][i].getx();
			double y2 = dp[2][i].gety();
			double x3 = dp[3][i].getx();
			double y3 = dp[3][i].gety();
			if(x[i] >= 0 && y[i] >= 0) {
				dp[0][i+1] = new dynamic(x0+x[i],y0+y[i], Math.sqrt((x0+x[i])*(x0+x[i])+(y0+y[i])*(y0+y[i])));
				if(Math.sqrt((x1+x[i])*(x1+x[i])+(y1+y[i])*(y1+y[i])) > dp[1][i].getd())
					dp[1][i+1] = new dynamic(x1+x[i],y1+y[i], Math.sqrt((x1+x[i])*(x1+x[i])+(y1+y[i])*(y1+y[i])));
				if(Math.sqrt((x2+x[i])*(x2+x[i])+(y2+y[i])*(y2+y[i])) > dp[2][i].getd())
					dp[2][i+1] = new dynamic(x2+x[i],y2+y[i], Math.sqrt((x2+x[i])*(x2+x[i])+(y2+y[i])*(y2+y[i])));
			}
			else if(x[i] >= 0 && y[i] < 0) {
				dp[1][i+1] = new dynamic(x1+x[i],y1+y[i], Math.sqrt((x1+x[i])*(x1+x[i])+(y1+y[i])*(y1+y[i])));
				if(Math.sqrt((x0+x[i])*(x0+x[i])+(y0+y[i])*(y0+y[i])) > dp[0][i].getd())
					dp[0][i+1] = new dynamic(x0+x[i],y0+y[i], Math.sqrt((x0+x[i])*(x0+x[i])+(y0+y[i])*(y0+y[i])));
				if(Math.sqrt((x3+x[i])*(x3+x[i])+(y3+y[i])*(y3+y[i])) > dp[3][i].getd())
					dp[3][i+1] = new dynamic(x3+x[i],y3+y[i], Math.sqrt((x3+x[i])*(x3+x[i])+(y3+y[i])*(y3+y[i])));
			}
			else if(x[i] < 0 && y[i] >= 0) {
				dp[2][i+1] = new dynamic(x2+x[i],y2+y[i], Math.sqrt((x2+x[i])*(x2+x[i])+(y2+y[i])*(y2+y[i])));
				if(Math.sqrt((x0+x[i])*(x0+x[i])+(y0+y[i])*(y0+y[i])) > dp[0][i].getd())
					dp[0][i+1] = new dynamic(x0+x[i],y0+y[i], Math.sqrt((x0+x[i])*(x0+x[i])+(y0+y[i])*(y0+y[i])));
				if(Math.sqrt((x3+x[i])*(x3+x[i])+(y3+y[i])*(y3+y[i])) > dp[3][i].getd())
					dp[3][i+1] = new dynamic(x3+x[i],y3+y[i], Math.sqrt((x3+x[i])*(x3+x[i])+(y3+y[i])*(y3+y[i])));
			}
			else if(x[i] < 0 && y[i] < 0) {
				dp[3][i+1] = new dynamic(x3+x[i],y3+y[i], Math.sqrt((x3+x[i])*(x3+x[i])+(y3+y[i])*(y3+y[i])));
				if(Math.sqrt((x1+x[i])*(x1+x[i])+(y1+y[i])*(y1+y[i])) > dp[1][i].getd())
					dp[1][i+1] = new dynamic(x1+x[i],y1+y[i], Math.sqrt((x1+x[i])*(x1+x[i])+(y1+y[i])*(y1+y[i])));
				if(Math.sqrt((x2+x[i])*(x2+x[i])+(y2+y[i])*(y2+y[i])) > dp[2][i].getd())
					dp[2][i+1] = new dynamic(x2+x[i],y2+y[i], Math.sqrt((x2+x[i])*(x2+x[i])+(y2+y[i])*(y2+y[i])));
			}			
		}
		for(int i = 0; i < 4; i++)
			ans = Math.max(dp[i][N].getd(), ans);
		System.out.println(ans);

	}

}