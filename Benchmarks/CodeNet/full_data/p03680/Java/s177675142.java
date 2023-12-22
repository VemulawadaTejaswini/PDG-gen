
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int[] button = new int[n];
		for (int i = 0; i < button.length; i++) {
			button[i] = sc.nextInt();
		}
		
		int next = 0;
		int cnt = 0;
		for (int i = 1;; i = next) {
			next = button[i - 1];
			cnt++;
			if (next == 2) {
				break;
			}
			
			if (cnt > n) {
				cnt = -1;
				break;
			}
			
		}
		System.out.println(cnt);

	}
}