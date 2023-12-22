import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int ans = solve();
		System.out.println(ans);
	}
	
	private static int solve() {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		sc.close();
		int count = 0;
		for (int i = 0; i < 6; i++) {
			if ((str.charAt(i)) == '1') {
				count++;
			}
		}
		return count;
	}
}