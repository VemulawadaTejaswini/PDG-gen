import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int A = sc.nextInt();
		int B = sc.nextInt();
		boolean[] ans = new boolean[4];
		ans[A] = true;
		ans[B] = true;
		for (int i = 1; i < ans.length; i++) {
			if (!ans[i]) {
				System.out.println(i);
			}
		}
	}
}