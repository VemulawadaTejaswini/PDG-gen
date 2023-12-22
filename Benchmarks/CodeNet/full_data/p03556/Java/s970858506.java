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
		for(int i = n; i > 0; i--){
		    for(int j = 1; j <= sqrt(i); j++){
		        if(j*j == i){
		            result = i;
		            break;
		        }
		    }
		    if(result > 0) break;
		}
		
		// 出力
		System.out.println(result);
	}
}

