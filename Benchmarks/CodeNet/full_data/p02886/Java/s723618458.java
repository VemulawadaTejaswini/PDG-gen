import java.util.*;
import static java.lang.Math.*;
import java.math.BigInteger;

public class Main {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int n = sc.nextInt();
		int[] d = new int[n];
		for(int i = 0; i < n; i++){
		    d[i] = sc.nextInt();
		}

		// 計算
	    int result = 0;
	    for(int i = 0; i < n; i++){
		    for(int j = i + 1; j < n; j++){
		        result += d[i]*d[j];
		    }
		}

		// 出力
		System.out.println(result);
        
	}
}
