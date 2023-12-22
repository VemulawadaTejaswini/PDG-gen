import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		long n = in.nextLong();
		long mincost = n;
		for(long i = 1; i<= Math.sqrt(n);i++) {
			if(n%i == 0) {
				long temp = i + n/i - 2;
				mincost = Math.min(mincost, temp);
			}
		}
		System.out.print(mincost);
	}
}
