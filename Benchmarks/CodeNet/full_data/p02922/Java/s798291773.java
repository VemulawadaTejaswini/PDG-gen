import java.util.Scanner;

public class powerSocket {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		int t = sc.nextInt();
//		StringBuilder finalAns = new StringBuilder();
//		while (--t >= 0) {
		int a = sc.nextInt(), b = sc.nextInt();
		double x = Math.floor(Math.log(b) / Math.log(a));
		double ans = Math.pow(a, x);
		x += Math.ceil((b - ans) / (a - 1));
		System.out.println(ans);
//		}
//		System.out.print(finalAns);
		sc.close();
	}
}
