import java.util.*;
import static java.lang.Math.*;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// 入力
		long a = sc.nextLong();
		long b = sc.nextLong();
		long c = sc.nextLong();

		// 計算
		String result = "No";
		if(4*a*b < (c-a-b)*(c-a-b)) result = "Yes";
		
		// 出力
		System.out.println(result);
	}
}



