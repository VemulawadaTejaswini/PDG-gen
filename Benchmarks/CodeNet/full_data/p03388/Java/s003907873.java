import java.util.*;
import static java.lang.Math.*;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int q = sc.nextInt();
		int[] a = new int[q];
		int[] b = new int[q];
		for(int i = 0; i < q; i++){
		    a[i] = sc.nextInt();
		    b[i] = sc.nextInt();
		}
		
		// 計算
		
		// 出力
		for(int i = 0; i < q; i++){
		    System.out.println(calc(a[i], b[i]));
		}
		
	}
	
	static int calc(int a, int b){
	    long ab = (long)a * b;
	    long l = (long)floor(sqrt(ab));
	    long r = l;
	    if(l*(r+1) < ab) r++;
	    long cnt = l*2 - 1;
	    if(l == r){
	        if(l*l == ab && a != l) cnt--;
	        cnt--;
	    }
	    return (int)cnt;
	}

}


