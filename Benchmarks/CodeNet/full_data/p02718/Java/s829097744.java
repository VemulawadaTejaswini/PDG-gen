import java.util.*;
import static java.lang.Math.*;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] a = new int[n];
		int sum = 0;
		for(int i = 0; i < n; i++){
		    a[i] = sc.nextInt();
		    sum += a[i];
		}
		Arrays.sort(a);
		
		// 計算
		String result = "Yes";
		int tmp = 0;
		for(int i = n-1; i >= n-1-m; i--){
		    if(sum%(4*m) == 0){
		        tmp = sum/(4*m);
		    }else{
		        tmp = sum/(4*m) + 1;
		    }
		    if(a[i] < tmp){
		        result = "No";
		        break;
		    }
		}
		
		// 出力
		System.out.println(result);
	}
}

