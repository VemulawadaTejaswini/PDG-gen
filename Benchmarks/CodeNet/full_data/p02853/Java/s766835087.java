import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int x = scan.nextInt();
		int y = scan.nextInt();

		int a = 0;

		if(x <= 3) {
			a += (4 - x) * 100_000;
		}
		if(y <= 3) {
			a += (4 - y) * 100_000;
		}
		if(x*y == 1) {
			a += 400_000;
		}

		System.out.println(a);

	}

}
