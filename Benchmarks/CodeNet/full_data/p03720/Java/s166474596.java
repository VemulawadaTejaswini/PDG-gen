import java.util.Scanner;

public class Main {
	static char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int M = sc.nextInt();

		int[] ans = new int[N + 1];
		for (int i = 0; i < (M * 2); i++) {
			ans[sc.nextInt()]++;
		}
		for (int i = 1; i < ans.length; i++) {
			System.out.println(ans[i]);
		}
	}
}
