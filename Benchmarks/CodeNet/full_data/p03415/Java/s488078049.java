import java.util.*;
import static java.lang.Math.*;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// 入力
		String a = sc.next();
		String b = sc.next();
		String c = sc.next();
		
		// 計算
		String result = a.substring(0, 1) + b.substring(1, 2) + c.substring(2, 3);
		
		// 出力
		System.out.println(result);
	}
}


