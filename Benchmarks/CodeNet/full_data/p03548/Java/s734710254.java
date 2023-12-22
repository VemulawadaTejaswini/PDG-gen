import java.util.*;

public class Main {
	public static void main(String[] args) {

		// 入力
		Scanner sc = new Scanner(System.in);
		
		// 数値
		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = sc.nextInt();
		
		
		int ans = (x-z)/(y+z);
		// 出力
		System.out.println(ans);

		sc.close();

	}
}