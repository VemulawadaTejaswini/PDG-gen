import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long X = sc.nextLong();
		long Y = sc.nextLong();
		long con = 0;

		Y = Y/X;

		while (Y > 0) {
			Y = Y / 2;
			con++;
		}

		System.out.println(con);

	}
}
