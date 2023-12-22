import java.util.Arrays;
import java.util.Scanner;

public class Main {
	static double D = 0;
	static double P = 0;
	static void rec(int n , double xs[] , double ys[], boolean vis[] , int pass[]){
		int N = xs.length;
		if(n == N){
			P++;
//			System.out.println(Arrays.toString(pass));
			double dist = 0;
			for(int i = 1 ; i < N ; ++i){
				double x0 = xs[pass[i - 1]];
				double y0 = ys[pass[i - 1]];
				double x1 = xs[pass[i]];
				double y1 = ys[pass[i]];
				double d = Math.hypot(x0 - x1, y0 - y1);
				dist += d;
			}
			D += dist;
			return ;
		}
		for(int i = 0 ; i < N ; ++i){
			if(vis[i]){
				continue;
			}
			vis[i] = true;
			pass[n] = i;
			rec(n + 1 , xs , ys , vis , pass);
			vis[i] = false;
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		double xs[] = new double[N];
		double ys[] = new double[N];		
		for(int i = 0 ; i < N ; ++i){
			xs[i] = sc.nextDouble();
			ys[i] = sc.nextDouble();
		}
		boolean vis[] = new boolean[N];
		int pass[] = new int[N];
		rec(0 , xs , ys , vis , pass);
		System.out.println(D / P);
	}
}
