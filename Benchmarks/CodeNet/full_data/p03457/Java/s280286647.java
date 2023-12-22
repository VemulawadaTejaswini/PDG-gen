import java.util.*;
import static java.lang.Math.*;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int n = sc.nextInt();
		int[] t = new int[n];
		int[] x = new int[n];
		int[] y = new int[n];
		for(int i = 0; i < n; i++){
		    t[i] = sc.nextInt();
		    x[i] = sc.nextInt();
		    y[i] = sc.nextInt();
		}
		
		// 計算
		String result = "Yes";
		for(int i = 0; i < n; i++){
		    int dx = 0;
		    int dy = 0;
		    int dt = 0;
		    
		    if(i == 0){
		        dx = x[i];
		        dy = y[i];
		        dt = t[i];
		    }else{
		        dx = x[i] - x[i-1];
		        dy = y[i] - y[i-1];
		        dt = t[i] - t[i-1];
		    }
		    
		    int d = abs(dx) + abs(dy);
		    if(d > dt || d%2 != dt%2) result = "No";
		}
		
		
		// 出力
		System.out.println(result);
	}
}

