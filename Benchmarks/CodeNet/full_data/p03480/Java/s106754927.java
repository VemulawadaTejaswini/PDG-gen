import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		char[] numbers = scanner.nextLine().toCharArray();
		
		int ans = 0;
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] == '1') {
				ans = numbers.length - i;
				if (ans==numbers.length) {
					ans--;
				}
				break;
			}
		}
		
		System.out.println(ans);
		scanner.close();
	}
}
