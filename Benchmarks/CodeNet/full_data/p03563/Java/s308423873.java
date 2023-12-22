import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double r = sc.nextInt();
		double g = sc.nextInt();
		double ans = 2 * g - r;
		System.out.println((int)ans);
	}
}
