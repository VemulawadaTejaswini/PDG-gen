import java.util.*;
import static java.lang.Math.*;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		// 入力
		long a = sc.nextLong();
		long b = sc.nextLong();
		long k = sc.nextLong();
		
		// 計算
		long takahashi = max(0, a - k);
		long aoki = max(0, b - max(0, k - a));
		
		
		// 出力
		System.out.println(takahashi + " " + aoki);
	}
}
