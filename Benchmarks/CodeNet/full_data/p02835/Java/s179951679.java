import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int a1 = sc.nextInt();
		int a2 = sc.nextInt();
		int a3 = sc.nextInt();

		System.out.println(a1 + a2 + a3 <= 21 ? "win" : "bust");
	}
}