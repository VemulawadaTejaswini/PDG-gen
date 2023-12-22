import java.util.*;
import static java.lang.Math.*;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		// 計算
		int result = 0;
		if(a*b == 2) result = 3;
		if(a*b == 3) result = 2;
		if(a*b == 6) result = 1;
		
		
		
		// 出力
		System.out.println(result);
	}
}


