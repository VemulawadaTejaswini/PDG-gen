import java.util.*;
import static java.lang.Math.*;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int n = sc.nextInt();
		int m = sc.nextInt();
		int x = sc.nextInt();
		int y = sc.nextInt();
		int maxX = x;
		int minY = y;
		for(int i = 0; i < n; i++){
		    int tmp = sc.nextInt();
		    maxX = max(maxX, tmp);
		}
		for(int i = 0; i < m; i++){
		    int tmp = sc.nextInt();
		    minY = min(minY, tmp);
		}
		
		// 計算
		String result = "No War";
		if(minY <= maxX) result = "War";
		
		// 出力
		System.out.println(result);
		
	}
}
