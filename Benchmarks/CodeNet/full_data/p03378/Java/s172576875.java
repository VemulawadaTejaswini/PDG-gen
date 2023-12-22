import java.sql.Array;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int m = sc.nextInt();
		// スペース区切りの整数の入力
		int n = sc.nextInt();
		int x = sc.nextInt();
		int[] a = new int[n];
		for (int i = 1; i <= n; i++) {
			a[i] = sc.nextInt();
		}

		int r = 0;

		for (int j = x; j < m + 1; j++) {
			if (j > m) {
				continue;
			}
			r = r + a[j];
		}

		// 出力
		System.out.println(String.valueOf(r));
	}
}