import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		double d = (double) (a+b)/2;
		double ans = Math.ceil(d);
		System.out.println((int) ans);
	}
}