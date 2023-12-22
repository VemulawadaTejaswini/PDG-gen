import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int k = scanner.nextInt();
		int x = scanner.nextInt();
		int y = scanner.nextInt();

		if(n - k >= 0){
			System.out.println(x*k+y*(n-k));
		}else{
			System.out.println(x*k);
		}
	}
}