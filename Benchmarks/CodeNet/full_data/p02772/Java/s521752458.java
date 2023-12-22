import java.util.*;
import static java.lang.Math.*;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int n = sc.nextInt();
		String result = "APPROVED";
		for(int i = 0; i < n; i++){
		    int a = sc.nextInt();
		    if(a%2 == 0 && (a%3 != 0 && a%5 != 0)) result = "DENIED";
		}
		
		// 計算
		//String result = "Yes";
		
		// 出力
		System.out.println(result);
	}
}
