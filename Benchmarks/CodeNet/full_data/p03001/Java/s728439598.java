import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long W = sc.nextLong();
		long H = sc.nextLong();
		long x = sc.nextLong();
		long y = sc.nextLong();
		
		double a = W / 2;
		double b = H / 2;
		double X = 2.0 * a - x;
		double Y = 2.0 * b - y;
		
		int num = 0;
		if(2 * x == W && 2 * y == H) {
			num = 1;
		}
		
		double S = W * H / 2.0;
		
		System.out.println(S + " " + num);
	}
}
