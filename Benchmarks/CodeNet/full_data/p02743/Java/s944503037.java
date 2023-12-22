import java.util.*;
import static java.lang.Math.*;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		// 計算
		String result = "No";
		if(sqrt(a) + sqrt(b) < sqrt(c)) result = "Yes";
		
		// 出力
		System.out.println(result);
	}
}



