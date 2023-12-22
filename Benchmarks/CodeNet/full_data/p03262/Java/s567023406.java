import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x[] = new int[n + 1];
		x[n] = sc.nextInt();
		for(int i = 0; i < n; i++) { 
			x[i] = sc.nextInt();
		}
		Arrays.sort(x);
		int g = x[1] - x[0];
		for(int i = 1; i + 1 < n; i++) {
			g = gcd(g, x[i + 1] - x[i]);
		}
		System.out.println(g);
		
	}
	
	static int gcd(int x, int y) {
		int w;
		while(x % y != 0) {
			w = y;
			y = x % y;
			x = w;
		}
		return y;
	}
}