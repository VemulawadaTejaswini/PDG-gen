import java.util.*;
import static java.lang.Math.*;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int n = sc.nextInt();
		HashSet<Integer> hs = new HashSet<Integer>();
		for(int i = 0; i < n; i++){
		    hs.add(sc.nextInt());
		}
		
		// 計算
		int result = hs.size();
		
		
		// 出力
		System.out.println(result);
	}
}

