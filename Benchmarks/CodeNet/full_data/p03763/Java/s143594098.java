
import java.util.Scanner;

public class Main {
	public static void main(String [] args){
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();
		
		long x[] = new long[n];
		long y[] = new long[m];

		for(int i = 0;i < n;i++){
			x[i] = scan.nextLong();
		}
		for(int i = 0;i < n;i++){
			y[i] = scan.nextLong();
		}
		long S = 0;
		

		for(int i = 0;i < n - 1;i++){
			for(int j = 0;j < m - 1;j++){
				S += (x[i + 1] - x[i]) * (y[j + 1] - y[j]);
				
			}
		}
		
		while(S > 100000007l)S -= 100000007;
		System.out.println(S);
	}
}