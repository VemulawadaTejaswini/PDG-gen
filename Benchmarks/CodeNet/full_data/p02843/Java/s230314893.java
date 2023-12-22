import java.util.*;
import static java.lang.Math.*;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int x = sc.nextInt();
		
		// 計算
		int result = 1;
		int rest = x%100;
		int s = (x-rest)/100;
		//System.out.println(rest);
		//System.out.println(s);
		if((rest + 4)/5 > s) result = 0;
		
		// 出力
		System.out.println(result);
	}
}
