import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] mens = new int[n];
		for(int i = 0; i < n; i++) {
			mens[i] = sc.nextInt();
		}
		int[] ans = new int[n];

		for(int i = 0; i < n; i++) {
			int a = mens[i] - 1;
			ans[a] = i;
		}
		for(int i = 0; i < n; i++) {
			System.out.println(ans[i] + 1);
		}

	}

}