import java.util.Arrays;
import java.util.Scanner;

public class Main{

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int n = Integer.parseInt(scanner.nextLine());


		int[][] list = new int[n][3];

		for(int i = 0; i < n; i++) {
			String[] temp = scanner.nextLine().split(" ");
			for(int j = 0; j < 3; j ++) {
				list[i][j] = Integer.parseInt(temp[j]);
			}
		}

		for(int i = 0; i < n; i++) {

			if(i > 0){
			list[i][0] += Math.max(list[i - 1][1], list[i - 1][2]);
			list[i][1] += Math.max(list[i - 1][0], list[i - 1][2]);
			list[i][2] += Math.max(list[i - 1][0], list[i - 1][1]);
			}
		}

		int ans = Math.max(list[n - 1][0], list[n - 1][1]);
		ans = Math.max(ans, list[n - 1][2]);

		System.out.println(ans);

	}

}
