import java.util.*;
import static java.lang.Math.*;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int n = sc.nextInt();
		
		// 計算
		String result = "No";
		if(n/100 == n%10) result = "Yes";

		// 出力
		System.out.println(result);
	}
}


