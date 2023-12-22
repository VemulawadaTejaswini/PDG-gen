import java.util.*;
import static java.lang.Math.*;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int n = sc.nextInt();
		int[] a = new int[n];
		for(int i = 0; i < n; i++){
		    a[i] = sc.nextInt();
		}
		// 計算
		int result = 0;
		int[] l = new int[n];
		int[] r = new int[n];
		int[] g = new int[n];
		for(int i = 0; i < n; i++){
		    if(i == 0){
		        l[i] = a[i];
		    }else{
		        l[i] = gcd(l[i-1], a[i]);
		    }
		}
		for(int i = n - 1; i >= 0; i--){
		    if(i == n - 1){
		        r[i] = a[i];
		    }else{
		        r[i] = gcd(r[i+1], a[i]);
		    }
		}
		for(int i = 0; i < n; i++){
		    int now = 0;
		    if(i == 0){
		        now = r[i+1];
		    }else if(i == n - 1){
		        now = l[i-1];
		    }else{
		        now = gcd(l[i-1], r[i+1]);
		    }
		    result = max(result, now);
		}
		
		// 出力
        System.out.println(result);
	}

	static int gcd(int x, int y){
	    if(x < y){
	        int temp = x;
	        x = y;
	        y = temp;
	    }
	    if(y == 0) return x;
	    if(x%y == 0) return y;
	    return gcd(y , x%y);
	}
}