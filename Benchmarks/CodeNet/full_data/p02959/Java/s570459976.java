import java.util.*;
import static java.lang.Math.*;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		// 入力
		int n = sc.nextInt();
		int[] a = new int[n + 1];
		int[] b = new int[n + 2];
		
		for(int i = 0; i < n + 1; i++){
		    a[i] = sc.nextInt();
		}
		for(int i = 0; i < n; i++){
		    b[i] = sc.nextInt();
		}
		b[n] = 0;
		b[n + 1] = 0;

		// 計算
		int result = 0;
		
		for(int i = 0; i < n + 1; i++){
		    int m = b[i] - a[i];
		    if(m >= 0){
		        result = result + a[i];
		        b[i + 1] = b[i + 1] + min(m, b[i]);
		    }else{
		        result = result + b[i];
		    }
		}
		// 出力
		System.out.println(String.valueOf(result));
	}
	
}
