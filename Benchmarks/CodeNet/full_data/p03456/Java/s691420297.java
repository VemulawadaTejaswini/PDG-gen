import java.util.Scanner;

public class Main {
	static int[][] bingo = new int[3][3];

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String a = sc.next();
		String b = sc.next();

		int num = Integer.parseInt(a + b);

		int root = (int) Math.sqrt(num);

		if (Math.pow(root, 2) == num) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}

}
