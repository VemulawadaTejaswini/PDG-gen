import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int A = scanner.nextInt();
		if (A >= N % 500) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}

}
