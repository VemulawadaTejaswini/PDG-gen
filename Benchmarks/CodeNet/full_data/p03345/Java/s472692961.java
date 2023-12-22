import java.util.Scanner;

public class Main {
	static int[][] bingo = new int[3][3];

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		long a = Long.parseLong(sc.next());
		long b = Long.parseLong(sc.next());
		long c = Long.parseLong(sc.next());
		long k = Long.parseLong(sc.next());
		if (k % 2 == 0) {
			System.out.println(a - b);
		} else {
			System.out.println(b - a);
		}
	}

}
