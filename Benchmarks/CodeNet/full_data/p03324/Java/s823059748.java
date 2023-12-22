import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int d = sc.nextInt();
			int n = sc.nextInt();
			int result = 0;
			
			switch (d) {
				case 0:
					result += 5;
					break;
				case 1:
					result = 100 * n;
					break;
				case 2:
					result = 10000 * n;
					break;
			}
			System.out.println(result);
		}
	}
}
