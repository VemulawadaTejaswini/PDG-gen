import java.util.*;
import static java.lang.Math.*;
import java.math.BigInteger;

public class Main {
    
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int n = sc.nextInt();
		int sum = 0;
		for(int i = 0; i < n; i++){
		    int l = sc.nextInt();
		    int r = sc.nextInt();
		    sum += r-l+1;
		}
		// 計算
		int result = sum;
		
		// 出力
		System.out.println(result);
		
	}
}
