import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Integer input = new Integer(scanner.next());
		Integer count = 0;

		while(input != 0) {
			input /= 2;
			count++;
		}

		System.out.println(count);

		scanner.close();
	}

}
