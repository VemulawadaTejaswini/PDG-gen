
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		
		int ans = n*a;
		
		if (ans>b) {
			ans=b;
		}
		
		System.out.println(ans);
		
		scanner.close();
	}

}
