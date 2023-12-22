import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int sum = 0;
		for (int i = 0; i < 9; i++) {
			sum += scanner.nextInt();
		}
		if (sum % 3 == 0 && sum / 3 <= 900) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}