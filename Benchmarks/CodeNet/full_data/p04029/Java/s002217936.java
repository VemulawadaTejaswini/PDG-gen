import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int count=0;
		for (int i = 1; i < n+1; i++) {
			count += i;
		}
		System.out.println(count);
	}
}
