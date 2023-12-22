
import java.util.Scanner;

public class Main{

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int n        = Integer.parseInt(scanner.nextLine());
		String[] tmp = scanner.nextLine().split(" ");
		int[] list   = new int[n];
		int now   = 0;
		int point = 0;
		for(int i = 0;i < n; i ++) {

			now = Integer.parseInt(tmp[i]);

			if(now == point + 1) {
				point++;
			}


		}


		int ans = n - point;

		if(ans == n && Integer.parseInt(tmp[n - 1]) == n) {

			System.out.println(ans);

		}else if(ans == n && Integer.parseInt(tmp[n - 1]) != n){

			System.out.println(-1);

		}else {

			System.out.println(ans);

		}
	}
}