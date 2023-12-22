import java.util.*;
import static java.lang.Math.*;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// 入力
		double w = sc.nextDouble();
		double h = sc.nextDouble();
		double x = sc.nextDouble();
		double y = sc.nextDouble();
			
		// 計算
		double result = w*h/2;
		int flg = 0;
		if(x == w/2 && y == h/2) flg = 1;

		// 出力
		System.out.print(result);
		System.out.print(" " + flg);
		
	}
}
