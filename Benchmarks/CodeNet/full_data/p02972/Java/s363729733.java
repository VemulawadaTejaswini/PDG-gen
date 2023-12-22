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
		int m = 0;
        int[] b = new int[n];
        Arrays.fill(b, 0);
		StringBuilder result = new StringBuilder();
		for(int i = n; i > 0; i-- ){
		    int sum = 0;
		    for(int j = n; j > i; j-- ){
                if(j%i == 0) sum = sum + b[j - 1];
		    }
		    if(sum%2 != a[i - 1]){
    		    m++;
    		    b[i - 1] = 1;
    		    if(result.length() != 0) result.append(" ");
    		    result.append(String.valueOf(i));
    		}
		}
		
		// 出力
		System.out.println(m);
		System.out.println(result);
	}

}
