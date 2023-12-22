
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
			System.out.println("a");
		}
		for(int i = 0;i < m;i++){
			y[i] = scan.nextLong();
			System.out.println("a");
		}
		long S = 0;
		

		for(int i = 0;i < n - 1;i++){
			for(int j = 0;j < m - 1;j++){
				S += Math.abs(x[i + 1] - x[i]) * Math.abs(y[j + 1] - y[j]);
				while(S > 100000007l)S -= 100000007l;
			}
		}
		
		
		System.out.println(S);
	}
}
