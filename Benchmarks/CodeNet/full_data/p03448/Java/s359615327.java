import java.util.Scanner;

public class Main {
	public static void main(String... args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int x = sc.nextInt();
  
		int result = 0;

		for (int fiveHundreds = a ; fiveHundreds >= 0 ; fiveHundreds--) {
			int remaining = x - fiveHundreds * 500;
			if (remaining >= 0) {
				for (int oneHundreds = b ; oneHundreds >= 0 ; oneHundreds--) {
					int remaining2 = remaining - oneHundreds * 100;
					if (remaining2 >= 0) {
						for (int fifties = c ; fifties >= 0 ; fifties--) {
							if (remaining2 == fifties * 50) {
								result++;
							}
						}
					}
				}
			}
		}
		System.out.println(result);
	}
}
