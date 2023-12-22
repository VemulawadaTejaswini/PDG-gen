import java.util.*;
import static java.lang.Math.*;
import java.math.BigInteger;

public class Main {
    
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int n = sc.nextInt();
		int m = sc.nextInt();
		int c = sc.nextInt();
		int[] b = new int[m];
		int cnt = 0;
		for(int i = 0; i < m; i++){
		    b[i] = sc.nextInt();
		}
		for(int i = 0; i < n; i++){
		    int sum = 0;
		    for(int j = 0; j < m; j++){
		        int a = sc.nextInt();
		        sum += a*b[j];
		    }
		    if(sum + c > 0) cnt++;
		}
		
		// 計算
		int result = cnt;
		
		// 出力
		System.out.println(result);
        
	}
}
