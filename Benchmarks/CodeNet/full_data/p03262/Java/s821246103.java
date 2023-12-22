import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int X = sc.nextInt();
		
		int[] d = new int[N];
		
		for(int i = 0; i < N; i++) {
			int a = sc.nextInt();
			d[i] = Math.abs(a - X);
		}
		
		int x = d[0];
		
		for(int i = 1; i < N; i++) {
			x = gcd(x, d[i]);
		}
		System.out.println(x);
	}
	
	public static int gcd(int a, int b) {
		if(b == 0) {
			return a;
		}
		return gcd(b, a % b);
	}
}
