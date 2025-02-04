
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long a = sc.nextLong();
		long b = sc.nextLong();
		long[] x = new long[n];
		long[] d = new long[n];
		for(int i=0; i<n; i++){
			x[i] = sc.nextLong();
			if(i==0){
				d[i] = 0;
			}else{
				d[i] = x[i] - x[i-1];
			}
		}
		sc.close();
		
		long ans = 0;
		for(int i=1; i<n; i++){
			if(d[i] * a > b){
				ans += b;
			}else{
				ans += a * d[i];
			}
		}
		
		System.out.println(ans);
		
	}

}