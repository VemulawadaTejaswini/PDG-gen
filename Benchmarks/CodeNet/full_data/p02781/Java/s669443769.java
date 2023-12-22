import java.util.Scanner;

//AtCoder Beginner Contest 154
//E	Almost Everywhere Zero
public class Main {

	static long countK1(String N) {
		long ans = 0;
		for (int i = N.length() - 1; i >= 0; i--) {
			int max = 0;
			if (i > 0) {
				max = 9;
			} else {
				max = N.charAt(i) - 48;
			}
			ans += max;
		}
		return ans;
	}

	static long countK2(String N) {
		long ans = 0;
		int first = N.charAt(0) - 48;
		StringBuilder s = new StringBuilder();
		for (int i = 0; i < N.length()-1; i++) {
			s.append("9");
		}
		ans = (first-1) * countK1(s.toString());
		ans += countK1(N.substring(1));
		return ans;
	}

	static long countK3(String N) {
		long ans = 0;
		int first = N.charAt(0) - 48;
		StringBuilder s = new StringBuilder();
		for (int i = 0; i < N.length()-1; i++) {
			s.append("9");
		}
		ans = (first-1) * countK2(s.toString());
		ans += countK2(N.substring(1));
		return ans;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String N = sc.next();
		int K = Integer.parseInt(sc.next());
		sc.close();

		long ans = 0;
		if (K == 1) {
			ans = countK1(N);
		}
		if (K == 2) {
			ans = countK2(N);
		}
		if (K == 3) {
			ans = countK3(N);
		}

		System.out.println(ans);
	}
}
