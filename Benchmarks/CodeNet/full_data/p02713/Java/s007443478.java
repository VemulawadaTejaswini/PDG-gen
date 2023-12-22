import java.util.*;
import java.math.*;
public class Main {
    
public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	// 入力
	int a = sc.nextInt();
	int res = 0;
	int gcd1 = 0;
	int gcd2 = 0;
    
    for(int i=1;i<=a;i++) {
        for(int j=1;j<=a;j++) {
            gcd1 = gcd(i, j);
            for(int k=1;k<=a;k++) {
                gcd2 = gcd(gcd1, k);
                res += gcd2;
            }
        }
        gcd1 = 0; //初期化
        gcd2 = 0; //初期化
    }
	// 出力
    System.out.println(res);
	}
	
	//最大公約数算出
	public static int gcd(int m, int n) {
	    int r = 0;
	    int a = 0;
	    int b = 0;
	    if(m >= n) {
	        a = m;
	        b = n;
	    } else {
	        a = n;
	        b = m;
	    }
        while( (r = a % b) != 0 ) {
            if(r != a) { 
                a = b;
                b = r;
            } else {
                b = a;
            }
        }
        return b;
    }
}