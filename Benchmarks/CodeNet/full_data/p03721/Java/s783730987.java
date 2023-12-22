import java.util.*;
import static java.lang.Math.*;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int n = sc.nextInt();
		long k = sc.nextLong();
		int[][] ab = new int[n][2];
		for(int i = 0; i < n; i++){
		    int a = sc.nextInt();
		    int b = sc.nextInt();
		    ab[i][0] = a;
		    ab[i][1] = b;
		}
		
		
		// 計算
		int result = 0;
		for(int i = 0; i < n; i++){
		    k -= ab[i][1];
		    if(k <= 0){
		        result = ab[i][0];
		        break;
		    }
		}
		
		// 出力
		System.out.println(result);
	}
}
