import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int x = sc.nextInt();

		int p1, p2;

		if (2 * x <= a * a * b) {
			p1 = a * b * b;
			p2 = 2 * x;
		} else {
			p1 =2*(a*a*b-x);
			p2=a*a*a;
		}

		double sit = Math.atan(p1/p2);
		
		System.out.println(sit + " " + Math.toDegrees(sit));
	}

}
