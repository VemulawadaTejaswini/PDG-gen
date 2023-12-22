import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 * 2019/06/09
 * AtCoder Beginner Contest 129
 * 
 * C - Typical Stairs
 * 
 * @author rued97
 */
public class Main {
	
	private static int N;
	private static List<Integer> as = new ArrayList<>();
	private static Map<Integer, Long> cash = new HashMap<>();

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt();
		int M = sc.nextInt();
		for(int i = 0; i < M; i++) {
			as.add(sc.nextInt());
		}
		
		long result = countPattern(0) % 1000000007;
		System.out.println(result);
	}
	
	private static long countPattern(int i) {
		// 計算済みの段はキャッシュを使用
		if(cash.containsKey(i)) {
			return cash.get(i);
		}
		// 最上段に達した
		if(i == N) {
			cash.put(i, 1l);
			return 1;
		}
		// 壊れた床だった
		if(as.contains(i)) {
			cash.put(i, 0l);
			return 0;
		}
	
		// 次の段以降を算出
		long result;
		result = countPattern(i + 1);
		if(i + 2 <= N) {
			result += countPattern(i + 2);
		}
		cash.put(i, result);
		return result;
	}
	
}
