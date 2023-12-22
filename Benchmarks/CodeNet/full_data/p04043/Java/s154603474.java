
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int A = scanner.nextInt();
		int B = scanner.nextInt();
		int C = scanner.nextInt();
		if ((A == 7 && C + B == 10) || (B == 7 && A + C == 10) || (C == 7 && A + B == 10))
			System.out.println("YES");
		else
			System.out.println("NO");
		scanner.close();
	}
}