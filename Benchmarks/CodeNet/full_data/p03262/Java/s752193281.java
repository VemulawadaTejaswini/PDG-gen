import java.util.Scanner;

public class Main{

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		//n x
		String[] temp = scanner.nextLine().split(" ");
		int n = Integer.parseInt(temp[0]);
		int x = Integer.parseInt(temp[1]);

		//list 差を求める
		int[] list = new int[n];
		String[] temp2 = scanner.nextLine().split(" ");
		int ans = Integer.MAX_VALUE;
		for(int i = 0; i < n; i++) {
			list[i] = Math.abs(Integer.parseInt(temp2[i]) - x);
			ans = Math.min(list[i], ans);
		}



		System.out.println(ans);

	}

}
