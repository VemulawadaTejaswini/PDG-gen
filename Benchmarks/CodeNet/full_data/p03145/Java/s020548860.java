import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Integer[] length = new Integer[3];

		for (int i = 0; i < length.length; i++) {
			length[i] = Integer.parseInt(scanner.next());
		}

		System.out.println(length[0] * length[1] / 2);

		scanner.close();
	}

}
