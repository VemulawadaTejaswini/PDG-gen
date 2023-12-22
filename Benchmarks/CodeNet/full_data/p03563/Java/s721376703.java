import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {

		Scanner sc = new Scanner(System.in);

		int R = sc.nextInt();
		int G = sc.nextInt();

		System.out.println(2*G - R);

	}
}
