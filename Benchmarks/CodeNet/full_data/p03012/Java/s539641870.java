
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int ans = 0;
		int[] list = new int[N + 1];
		for(int i = 1; i < N + 1; i++) {
			list[i] = sc.nextInt();
			ans += list[i];
		}
		for(int i = 1; i < N + 1; i++) {
			int tmp = Math.abs(ans - list[i]);
			if(tmp < ans) {
				ans = tmp;
			} else {
				System.out.println(ans);
				break;
			}
		}
	}

}
