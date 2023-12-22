import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int s = sc.nextInt();
		int x[] = new int[n];
		int d[] = new int[n];
		for(int i = 0; i < n; i++) { 
			x[i] = sc.nextInt();
			d[i] = Math.abs(s - x[i]);
		}
		int g = x[1] - x[0];
		for(int i = 2; i < n; i++) {
			g = gcd(g, x[i] - x[i - 1]);
		}
		int max = 0;
		int num;
		for(int i = 0; i < n; i++) {
			num = gcd(g, d[i]);
			if(max < num) max = num;
		}
		System.out.println(max);
		
	}
	
	static int gcd(int x, int y) {
		int w;
		while(x % y != 0) {
			w = y;
			y= x % y;
			x = w;
		}
		return y;
	}
}