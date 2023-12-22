import java.util.Scanner;

public class Main {
	static int count(double xs[] , double ys[] , double C[] , double sec , double x , double y){
		int cnt = 0;
		for(int i = 0 ; i < xs.length ; ++i){
			double d = Math.hypot(xs[i] - x, ys[i] - y);
			if(d < sec / C[i] || Math.abs(sec / C[i] - d) <= 1e-9){
				++cnt;
			}			
		}
		return cnt;
	}
	// sec秒後に焼ける肉の枚数がK個以上かどうか判定する
	static boolean can(double xs[] , double ys[] , double C[] , double sec, int K){
		for(int i = 0 ; i < xs.length ; ++i){
			if(count(xs , ys , C , sec, xs[i] , ys[i]) >= K){
				return true;
			}
			for(int j = 0 ; j < xs.length ; ++j){
				if(i == j){
					continue;
				}
				double D = Math.hypot(xs[i] - xs[j], ys[i] - ys[j]);
				double ri = sec / C[i];
				double rj = sec / C[j];
				if(D >= ri + rj){
					continue;
				}
				if(ri >= D + rj || rj >= D + ri){
					continue;
				}
				double a = Math.acos((ri * ri + D * D - rj * rj) / (2 * ri * D));
				double t = Math.atan2(ys[j] - ys[i], xs[j] - xs[i]);
				if(count(xs, ys, C, sec, xs[i] + Math.cos(t + a) * ri, ys[i] + Math.sin(t + a) * ri) >= K){
					return true;
				}
				if(count(xs, ys, C, sec, xs[i] + Math.cos(t - a) * ri, ys[i] + Math.sin(t - a) * ri) >= K){
					return true;
				}
			}
		}
		return false;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		double xs[] = new double[N];
		double ys[] = new double[N];
		double C[] = new double[N];
		for(int i = 0 ; i < N ; ++i){
			xs[i] = sc.nextDouble();
			ys[i] = sc.nextDouble();
			C[i] = sc.nextDouble();
		}
		double low = 0.0;
		double high = 0.0;
		for(int i = 0 ; i < N ; ++i){
			double d = Math.hypot(xs[i], ys[i]) * C[i];
			high = Math.max(high, d);		
		}
		while((high - low) >= 1.0e-8){
			double mid = (high + low) / 2;
			if(can(xs, ys, C, mid, K)){
				high = mid;
			}else{
				low = mid;
			}
		}
		System.out.println(low+" "+high);
	}
}
