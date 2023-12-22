import java.util.*;
import static java.lang.Math.*;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int x = sc.nextInt();
		
		// 計算
		int result = 0;
		for(int i = 0; i <= x; i++){
		    if(i*i > x) break;
		    result = i*i;
		}
		
		
		// 出力
		System.out.println(result);
	}
}
