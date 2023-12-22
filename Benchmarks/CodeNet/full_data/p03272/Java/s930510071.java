import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String[] tokens = in.nextLine().split(" ");
		int N = Integer.parseInt(tokens[0]);
		int i = Integer.parseInt(tokens[1]);

		System.out.println((N - i + 1));
		in.close();
	}
}
