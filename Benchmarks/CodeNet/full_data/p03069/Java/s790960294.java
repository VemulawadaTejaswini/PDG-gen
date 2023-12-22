import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		String S = sc.next();

		char a[] = new char[N];
		for (int i = 0; i < N; i++) {
			a[i] = S.charAt(i);
		}

		int ans = 0;

		for (int i = 0; i < N; i++) {
			if (i == N-1) {
				break;
			}
			if (a[i] == '#' && a[i+1]=='.') {
				ans++;
			}
		}
		System.out.println(ans);
	}
}
