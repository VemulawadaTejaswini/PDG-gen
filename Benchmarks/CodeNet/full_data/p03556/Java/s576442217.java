import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int X = reader.nextInt();
		int ans = getMaxSquareBase(X);

		System.out.println((int)Math.pow(ans, 2));
		reader.close();
	}

	public static int getMaxSquareBase(int num) {
		int base = 1;
		while (Math.pow((base + 1), 2) <= num) {
			base++;
		}
		return base;
	}
}



