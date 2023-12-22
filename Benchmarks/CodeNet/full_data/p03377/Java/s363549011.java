import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int a = sc.nextInt();
		// スペース区切りの整数の入力
		int b = sc.nextInt();
		int x = sc.nextInt();

		String r = "";
		if ((a + b) >= x || x <= a) {
			r = "YES";
		} else {
			r = "NO";
		}

		// 出力
		System.out.println(r);
	}
}