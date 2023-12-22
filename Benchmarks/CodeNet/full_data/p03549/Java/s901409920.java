import java.util.Scanner;

public class  Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();

		int y = (1900 * m + 100 * (m - n)) * (int) Math.pow(2, m);
		System.out.println(y);
		sc.close();
	}

}
