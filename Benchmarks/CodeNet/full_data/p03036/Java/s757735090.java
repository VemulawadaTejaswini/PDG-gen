import java.util.Scanner;

public class Main{

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String[] temp = scanner.nextLine().split(" ");

		int r = Integer.parseInt(temp[0]);
		int d = Integer.parseInt(temp[1]);
		int x = Integer.parseInt(temp[2]);
		int ans = 0 ;
		ans = solve(r, d, x ,9);



	}

	public static int solve(int r, int d, int x, int count) {

		if(count == 0) {
			int ans = r * x - d;
			System.out.println(ans);
			return r * x - d;
 		}else {

			int ans = r * solve(r, d, x, count - 1) - d;
			System.out.println(ans);
			return ans;
 		}

	}

}
