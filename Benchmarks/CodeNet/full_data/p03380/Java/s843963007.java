import java.util.*;
import static java.lang.Math.*;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int n = sc.nextInt();
		int[] a = new int[n];
		int max = 0;
		for(int i = 0; i < n; i++){
		    a[i] = sc.nextInt();
		    max = max(max, a[i]);
		}
		
		// 計算
		double k = max/2;
		double min = max;
		int index = 0;
		for(int i = 0; i < n; i++){
		    if(abs(k - a[i]) < min && a[i] < max){
		        index = i;
		        min = abs(k - a[i]);
		    }
		}
		
		// 出力
		System.out.println(max + " " + a[index]);
		
	}

}


