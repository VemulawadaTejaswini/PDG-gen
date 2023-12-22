
import java.util.Comparator;
import java.util.Scanner;
import java.util.ArrayList;
import java.math.BigDecimal;
// doubleを整数にして表示させたいとき：System.out.println(BigDecimal.valueOf(ans).toPlainString()); 

public class Main {
	Scanner sc = new Scanner(System.in);
	int n;
	double c;
	Pair pairs[];
	public void run(){
		n = sc.nextInt();
		c = sc.nextDouble();
		solve();
	}
	public void solve(){
		int num = 0;
		
		double[] rcal = new double[n]; // 右回りの際のその位置までの摂取カロリー 
		double[] lcal = new double[n];
		
		pairs = new Pair[n];
		for(int i = 0; i < n; i++){
			double x = sc.nextDouble();
			double v = sc.nextDouble();
			pairs[i] = new Pair(x, v);
			
			if(i == 0){
				rcal[i] = v;
			}
			else{
				rcal[i] = rcal[i-1] + v;
			}
		}
		lcal[n-1] = pairs[n-1].second; 
		
		double ans = 0;
		for(int i = n-2; i >= 0; i--){
			lcal[i] = lcal[i+1] + pairs[i].second;
			
			if(ans < lcal[i] - (c- pairs[i].first)){
				ans = lcal[i] - (c- pairs[i].first);
			}
		}
		
		for(int i = 0; i < n; i++){
			if(ans < rcal[i] - pairs[i].first){
				ans = rcal[i] - pairs[i].first;
			}
			for(int j = i+1; j < n; j++){
				double val = rcal[i] - 2 * pairs[i].first + lcal[j] - (c - pairs[j].first);
				double val2 = rcal[i] -pairs[i].first + lcal[j] - 2 * (c - pairs[j].first);
				
				if(ans < val) ans = val;
				else if(ans < val2) ans = val2;
			}
		}
		
		BigDecimal ansbd = BigDecimal.valueOf(ans);
		ansbd = ansbd.setScale(0, BigDecimal.ROUND_DOWN);
		
		System.out.println(ansbd.toPlainString());
	}
	
	public static void main(String[] args){
		new Main().run();
	}
	
	static class Pair {
        double first,second;
        public Pair(double a,double b) {
            this.first = a;
            this.second = b;
        }
    }	
	class MyComparator implements Comparator {
		@Override
		public int compare (Object arg0, Object arg1) {
			double x = ((Pair)arg0).first;
			double y = ((Pair)arg1).first;
			
			if (x < y) {
				return 1;
			} else if (x > y) {
				return -1;
			} else{
				return 0;
			}
		}
	}
}