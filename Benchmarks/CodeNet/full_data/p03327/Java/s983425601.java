import java.util.*;
import static java.lang.Math.*;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int n = sc.nextInt();
		
		// 計算
		String result = "ABC";
		if(n >= 1000) result = "ABD";
		
		// 出力
		System.out.println(result);
	}
}
