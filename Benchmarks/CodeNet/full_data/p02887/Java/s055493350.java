import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);

		//		143
		int N = sc.nextInt();
		String S = sc.next();

		char[] A = S.toCharArray();

		int ans = 1;
		for (int i = 0; i < N-1; i++) {
			if (A[i] != A[i + 1])
				ans++;
		}

		System.out.println(ans);
    }
}