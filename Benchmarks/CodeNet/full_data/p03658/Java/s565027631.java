import java.util.*;
import static java.lang.Math.*;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] l = new int[n];
		for(int i = 0; i < n; i++){
		    l[i] = sc.nextInt();
		}
		Arrays.sort(l);
		
		// 計算
		int result = 0;
		for(int i = 0; i < k; i++){
		    result += l[n-i-1];
		}
		
		// 出力
		System.out.println(result);
	}

}


