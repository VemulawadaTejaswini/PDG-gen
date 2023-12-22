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
		int result = 1;
		int max = m;
		if(n <= sqrt(m)) m = (int)sqrt(m);
		for(int i = n; i <= m; i++){
		    if(m%i == 0){
		        result = m/i;
		        break;
		    }
		}
		
		// 出力
		System.out.println(result);
		
	}
}