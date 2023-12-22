import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		double a,b,c,d;

		Scanner sc = new Scanner(System.in);

		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();
		d = sc.nextDouble();

		double sum = a * b / 2;
		int ans = 0;

		if (a/2 == c && b/2 == d) {
			ans = 1;
		}

		System.out.println(sum + " " + ans);


	}
}
