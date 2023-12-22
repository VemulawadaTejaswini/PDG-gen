import java.util.*;
import static java.lang.Math.*;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int n = sc.nextInt();
		long[] a = new long[n];
		for(int i = 0; i < n; i++){
		    a[i] = sc.nextLong();
		}
		Arrays.sort(a);
		
		// 計算
		long result = 0L;
		long tate = 0L;
		long yoko = 0L;
		boolean flg = false;
		for(int i = n-1; i >= 0; i--){
		    if(!flg && tate == a[i]){
		        flg = true;
		    }else if(!flg){
		        tate = a[i];
		    }else if(yoko == a[i]){
		        result = tate * yoko;
		        break;
		    }else{
		        yoko = a[i];
		    }
		}
		
		// 出力
		System.out.println(result);
	}
}


