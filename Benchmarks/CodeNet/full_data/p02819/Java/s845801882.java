
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		outside: for (int i = n;; i++) {
			for (int j = 2; j < n; j++) {
				if (i % j == 0) {
					continue outside;
				}
			}
			System.out.println(i);
			break;
		}
		
	}
}
