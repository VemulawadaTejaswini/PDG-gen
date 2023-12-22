
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = Integer.parseInt(sc.next());
		int k = Integer.parseInt(sc.next());
		
		double []sum = new double  [n+1];
		double []d = new double [500001];
		
		d[0] = 1;
		sum[0] = 0;
		
		for(int i = 1 ; i <= 500000 ; i++) {
			d[i] = (d[i-1] * i)/(i+1) + 1;
		}
		for(int i = 0 ; i < n ;i++) {
			int p = Integer.parseInt(sc.next());
			sum[i] += d[p-1];
			sum[i+1] = sum[i];
		}
		
		double max = -1;
		for(int i = 1 ; i <= n-k ;i++) {
			max = Math.max(sum[k+i] - sum[i], max);			
		}
		
		System.out.println(max);
	}
}
