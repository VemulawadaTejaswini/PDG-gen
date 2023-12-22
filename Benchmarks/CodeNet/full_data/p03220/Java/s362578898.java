import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int t = sc.nextInt();
		int a = sc.nextInt();
		double[] h = new double[n];

		for(int i=0; i<n; i++){
			int b = sc.nextInt();
			h[i] = t - b*0.006;
		}

		double min = 1000000000;
		int ans=-1;
		for(int i=0; i<n; i++){
			double x;
			if(h[i] >= a){
				x = h[i]-a;
			}else{
				x = a - h[i];
			}
			if(x <= min){
				ans = i;
				min = x;
			}
		}
		System.out.println(ans+1);



	}
}