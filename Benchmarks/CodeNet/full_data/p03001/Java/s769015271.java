import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		int a,b,c,d;

		Scanner sc = new Scanner(System.in);

		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		d = sc.nextInt();

		int sum = a * b / 2;
		int ans = 0;

		if (a/2 == c && b/2 == d) {
			ans = 1;
		}

		System.out.println(sum + " " + ans);


	}
}
