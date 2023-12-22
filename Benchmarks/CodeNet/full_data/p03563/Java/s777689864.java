import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int R = scan.nextInt();
		int G = scan.nextInt();
		// (R + x) / 2 = G
		// R + x = 2G
		// x = 2G - R
		System.out.println(2 * G - R);
		scan.close();

	}

}
