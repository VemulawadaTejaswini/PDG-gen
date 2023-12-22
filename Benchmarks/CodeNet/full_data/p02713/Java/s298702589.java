import java.util.*;
import static java.lang.Math.*;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int k = sc.nextInt();
		
		// 計算
		long result = 0;
		int[][] a = new int[k][k]; 
		for(int i = 1; i <= k; i++){
		    for(int j = 1; j <= k; j++){
		        a[i-1][j-1] = gcd(i, j);
		    }
		}
		for(int i = 1; i <= k; i++){
		    for(int j = 1; j <= k; j++){
		        for(int l = 1; l <= k; l++){
		            result += gcd(a[i-1][j-1], l);
		        }
		    }
		}
		
		// 出力
		System.out.println(result);
	}
	
	static int gcd(int x, int y){
		if(y == 0) return x;
		return gcd(y , x%y);
	}
	
}

