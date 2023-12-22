import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String pre = "";
		String str = "";
		String ans = "Yes";

		for (int i = 0; i < n; i++) {
			str = sc.next();
			if (i > 0 && (!pre.substring(pre.length() - 2, pre.length() - 1).equals(str.substring(0, 1))
					|| pre.contains("*" + str + "*"))) {
				ans = "No";
			} else {
				pre += "*" + str + "*";
			}
		}

		System.out.println(ans);
		sc.close();
	}

}
