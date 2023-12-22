import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		char[] c = s.toCharArray();
		int n = s.length() - 1;
		String ans = null;
		for (int i = 0; i < (1 << n); i++) {
			long sum = c[0] - '0';
			StringBuilder formula = new StringBuilder();
			formula.append(sum);
			for (int j = 0; j < n; j++) {
				if ((i & (1 << j)) != 0) {
					sum += c[j + 1] - '0';
					formula.append("+" + c[j + 1]);
				} else {
					sum -= c[j + 1] - '0';
					formula.append("-" + c[j + 1]);
				}
			}
			if (sum == 7) {
				formula.append("=7");
				ans = formula.toString();
				break;
			}
		}
		System.out.println(ans);
		sc.close();
	}
}