import java.util.Scanner;

public class Main {

	private static int money;

	private static int cakeFare;

	private static int donutFare;

	public static void main(String[] args) {

		scan();
		System.out.println((money - cakeFare) % donutFare);
	}

	private static void scan() {
		Scanner sc = new Scanner(System.in);
		money = sc.nextInt();
		cakeFare = sc.nextInt();
		donutFare = sc.nextInt();
		sc.close();
	}
}