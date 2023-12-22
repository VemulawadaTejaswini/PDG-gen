import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();

		double c = b - 1;
		double d = a - 1;
		int ans = (int)Math.ceil(c / d);
		System.out.println(ans);

		sc.close();

	}

}
