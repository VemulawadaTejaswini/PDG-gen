import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		sc.close();
		System.out.println(solve(a, b, c));
	}
	public static String solve(int a, int b, int c) {
		double ad = Math.sqrt(a);
		double bd = Math.sqrt(b);
		double cd = Math.sqrt(c);
		// System.out.println(ad + " " + bd + " " + cd);
		// System.out.println((int)ad + " " + (int)bd + " " + (int)cd);
		return (int)ad + (int)bd < (int)cd ? "Yes" : "No";
	}
}
