import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		long xsum = 0;
		long ysum = 0;
		long p = 1000000007;

		for(int i=0; i<n; i++){
			xsum += sc.nextLong() * (2*i - n + 1);
		}
		xsum %= p;

		for(int i=0; i<m; i++){
			ysum += sc.nextLong() * (2*i - m + 1);
		}
		ysum %= p;

		System.out.println((xsum*ysum)%p);
	}
}