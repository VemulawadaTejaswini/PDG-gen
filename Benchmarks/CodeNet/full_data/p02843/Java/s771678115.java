import java.util.Scanner;

public class Main {
	static int[] con = new int[6];
	static int[] price = new int[] {100,101,102,103,104,105};
	static int[] memo;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		Main main = new Main();
		memo = new int[100105];
		if (main.DP(X, 0)) {
			System.out.println("1");
		} else {
			System.out.println("0");
		}

	}

	public boolean DP(int X,int sum) {
		if (memo[sum] == 1) {
			return false;
		}else {
			if (sum > X) {
				memo[sum] = 1;
				return false;
			}else if (sum == X ) {
				return true;
			}else {
				for (int i = 0; i < 6; i++) {
					if (con[i] < 1001) {
						con[i]++;
						if (DP(X, sum + price[i])) {
							return true;
						}
						con[i]--;
					}
				}
				memo[sum] = 1;
				return false;
			}
		}
	}
}