
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	
	static int n,m;
	static long[][] cake;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		 n = Integer.parseInt(sc.next());
		 m = Integer.parseInt(sc.next());
		
		cake = new long [n][3];
		
		for(int i = 0 ; i < n ;i++) {
			cake[i][0] = Long.parseLong(sc.next());
			cake[i][1] = Long.parseLong(sc.next());
			cake[i][2] = Long.parseLong(sc.next());
		}
		
		long ans = -1;
		
		for(int i = 0 ; i < Math.pow(2, 3) ;i++) {
			int []x = new int [3];
			long []sum = new long [n];
			for(int j = 0 ; j < 3 ; j++) {
				if(((i >> j) & 1) == 1) {
					x[j] = 1;
				}
				else {
					x[j] = -1;
				}
			}
			
			for(int j  = 0 ; j < n ;j++) {
				for(int k = 0 ; k < 3 ;k++) {
					if(x[k] == 1) {
						sum[j] += cake[j][k];
					}
					else {
						sum[j] -= cake[j][k];
					}
				}
			}
			
			Arrays.sort(sum);
			long temp = 0;
			for(int j = n-1 ; j > n-1-m ;j--) {
				temp += sum[j];
				//System.out.println(sum[j]);
			}
			ans = Math.max(temp, ans);
		}
		
		System.out.println(ans);
	}
}

