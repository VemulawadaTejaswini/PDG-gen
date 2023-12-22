import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		long K = in.nextLong();
		long sum = 0;
		for(int i=1; i<=K; i++) {
			for(int j=1; j<=K; j++) {
				for(int k=1; k<=K; k++) {
					sum = sum + gcd(k, gcd(i,j));
				}
			}
		}
		
		System.out.println(sum);
		
	}
	
	public static int gcd(int x, int y) {
		if(y == 0) {
			return x;
		}
		return gcd(y, x%y);
	}
	
}
