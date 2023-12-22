import java.util.*;
import static java.lang.Math.*;
import java.math.BigInteger;

public class Main {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int n = sc.nextInt();
		
		// 計算
		int result = 0;
		if(n <= 111){
		    result = 111;
		}else if(n <= 222){
		    result = 222;
		}else if(n <= 333){
		    result = 333;
		}else if(n <= 444){
		    result = 444;
		}else if(n <= 555){
		    result = 555;
		}else if(n <= 666){
		    result = 666;
		}else if(n <= 777){
		    result = 777;
		}else if(n <= 888){
		    result = 888;
		}else if(n <= 999){
		    result = 999;
		}
		
		
		// 出力
		System.out.println(result);
		
	}
}