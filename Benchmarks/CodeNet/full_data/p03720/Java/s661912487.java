import java.util.*;
import static java.lang.Math.*;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] r = new int[n];
		for(int i = 0; i < m; i++){
		    int a = sc.nextInt()-1;
		    int b = sc.nextInt()-1;
		    r[a]++;
		    r[b]++;
		}
		
		
		// 計算
		//String result = "No";
		
		// 出力
		for(int i = 0; i < n; i++){
		    System.out.println(r[i]);
		}
		//System.out.println(result);
	}
}
