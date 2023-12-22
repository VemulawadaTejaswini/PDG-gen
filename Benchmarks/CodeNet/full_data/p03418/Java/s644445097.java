import java.util.*;
import static java.lang.Math.*;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int n = sc.nextInt();
		int k = sc.nextInt();
		
		// 計算
		int result = 0;
		for(int b = 1; b <= n; b++){
		    int p = n/b;
		    int r = n%b;
		    result += max(b-k, 0)*p + max(r-k+1, 0);
			if(k == 0) result--;
		}
		
		// 出力
		System.out.println(result);
	}
}


