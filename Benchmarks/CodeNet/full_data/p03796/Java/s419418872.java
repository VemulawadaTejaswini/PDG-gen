import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		long ans = 1;
		for(int i = 1; i < n+1; i++){
			ans = ans * i;
		}
		System.out.println(ans % 1000000007);
	}
}