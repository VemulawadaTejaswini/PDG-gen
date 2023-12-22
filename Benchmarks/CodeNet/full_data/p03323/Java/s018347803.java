import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int A = scanner.nextInt();
		int B = scanner.nextInt();
		scanner.close();
		if (8 >= A && 8 >= B)
			System.out.println("Yay!");
		else
			System.out.println(":(");
	}
}