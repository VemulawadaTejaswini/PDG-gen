import java.util.*;

public class Main {
	public static void main(final String[] args) {
		final Scanner sc = new Scanner(System.in);
		// 文字列の入力
		final String a = sc.next();
		// カウント
		int count =0;
		for (int i = 0; i < 3; i++){
			if (a.charAt(i) == '1') {
				count++;
			}
		}
		System.out.println(count);

	}
}