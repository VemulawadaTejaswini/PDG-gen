import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		
		if (N < 105) {
			System.out.println(0);
			return;
		}
		int count = 0;
		int sum = 1;
		
		for (int j = 106; j <= N; j++) {
			if (j % 2 == 0) {
				continue;
			}
			for (int i = 1; i <= j; i++) {
				if (j % i == 0) {
					count++;
				}
			}
			
//			System.out.println(count);
			if (count == 8) {
				sum++;
			}
			count = 0;
		}
		
		System.out.println(sum);
		scanner.close();
	}
}