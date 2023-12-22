import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner stdin = new Scanner(System.in);

		int inN = stdin.nextInt();
		String result = "Three";
		for (int i = 0; i < inN; i++) {
			if (stdin.next().equals("Y")) {
				result = "Four";
				break;
			}
		}

		System.out.println(result);
	}

}
