import java.util.*;
import static java.lang.Math.*;
import java.math.BigInteger;

public class Main {
    
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int n = sc.nextInt();
		int[] h = new int[n];
		int max = 0;
		int cnt = 0;
		for(int i = 0; i < n; i++){
		    h[i] = sc.nextInt();
		    if(max <= h[i]){
		        cnt++;
		        max = h[i];
		    }
		}
		
		// 計算
		int result = cnt;
		
		// 出力
		System.out.println(result);
        
	}
}