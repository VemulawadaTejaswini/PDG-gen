import java.util.*;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String S = sc.next();
		sc.close();

		int ans = 0;
		for (int i = 1; i < N; i++) {
			char pre = S.charAt(i-1);
			char post = S.charAt(i);
			if (pre == post) {
				ans++;
			}
		}

		System.out.println(N - ans);
	}
}
