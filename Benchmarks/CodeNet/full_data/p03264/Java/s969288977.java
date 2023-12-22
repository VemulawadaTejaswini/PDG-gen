import java.util.Scanner;

class Main {
	public static void main(String args[]) {
		StringBuilder sb = new StringBuilder();
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		int ans;
		if (k % 2 == 0) {
			ans = k / 2 * k / 2;
		} else {
			ans = k / 2 * (k + 1) / 2;
		}
		System.out.print(ans);
	}
}
