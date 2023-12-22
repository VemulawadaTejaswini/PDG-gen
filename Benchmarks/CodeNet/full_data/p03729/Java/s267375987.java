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
		String result = "NO";
		if(a.charAt(a.length()-1) == b.charAt(0) && b.charAt(b.length()-1) == c.charAt(0)) result = "YES";
		
		// 出力
		System.out.println(result);
	}
}
