import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String[] tokens = in.nextLine().split(" ");
		int a = Integer.parseInt(tokens[0]);
		int b = Integer.parseInt(tokens[1]);
		int diff = b - a;
		System.out.println((sum(diff) - b));

		in.close();
	}

	private static int sum(int diff) {
		int result = 0;
		for (int i = 0; i <= diff; ++i) {
			result += i;
		}
		return result;
	}

}