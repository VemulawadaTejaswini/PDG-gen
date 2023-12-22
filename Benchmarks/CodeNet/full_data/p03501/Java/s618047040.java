import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int t = sc.nextInt();

		int a = sc.nextInt();

		int b = sc.nextInt();

		int priceA = a * t;

		int priceB = b;

		if (priceA < priceB) {
			System.out.println(priceA);
		} else {
			System.out.println(priceB);
		}

	}

}
