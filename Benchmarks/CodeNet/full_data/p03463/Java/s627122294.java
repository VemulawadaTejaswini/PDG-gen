import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int A = scanner.nextInt();
		int B = scanner.nextInt();
		scanner.close();
		if ((A == 0 && B == 1) || (A == N && B == N - 1)) {
			System.out.println("Borys");
			return;
		}
		
		if ((A - B) % 2 != 0) {
			System.out.println("Borys");
			return;
		} else {
			System.out.println("Alice");
			return;
		}
		
	}
	
}