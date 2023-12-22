import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String num = sc.next();

		String sub;

		int sum = 0;
		for (int i = 0; i < num.length(); i++) {
			sub = num.substring(i, i + 1);
			sum += Integer.parseInt(sub);
		}
		String s;
		if (12 % sum == 0) {
			s = "Yes";
		} else {
			s = "No";
		}
		// 出力
		System.out.println(s);
	}
}
