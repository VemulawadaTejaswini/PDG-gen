import java.util.*;
import static java.lang.Math.*;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		// 計算
		int result = 0;
		if(n == 1 && m == 1){
		    result = 1; 
		}else if(n == 1 || m == 1){
		    result = max(n, m) - 2;
		}else{
		    result = max(0, (n-2))*max(0, (m-2));
		}
		
		// 出力
		System.out.println(result);
	}
}


