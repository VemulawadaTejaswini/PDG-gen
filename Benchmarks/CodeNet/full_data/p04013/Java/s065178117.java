import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
//import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
//import java.util.Set;
//import java.util.stream.Collectors;
//import java.util.stream.IntStream;

public class Main {
	
	public static void main(String[] args) {
		// 入力
		final int n, a;
		final int[] x;
		try(Scanner scan = new Scanner(System.in)) {
			n = scan.nextInt();	// 1≤N≤50
			a = scan.nextInt();	// 1≤N≤50
			x = new int[n];
			for (int i = 0; i < n; i++) {
				// 平均値計算用の値に換算しておく
				x[i] = scan.nextInt() - a;	// 1≤xi≤50
			}
		}
		
		//x[]の総和が0になる組み合わせの数を求める。
		// 絶対値の和はたかだか2500以下
		int[] positive = Arrays.stream(x).filter(i -> i > 0).toArray();
		Arrays.sort(positive);
		int[] zero = Arrays.stream(x).filter(i -> i == 0).toArray();
		int[] negative = Arrays.stream(x).filter(i -> i < 0).map(i -> -i).toArray();	//符号反転させておく
		Arrays.sort(negative);
		
		// positiveとnegativeの合計が等しくなる組み合わせに最後に2^zero.lengthをかける。
		// ここからpositiveとnegativeについて動的計画法をかける?
		// key がとりうる合計値、value が場合の数
		Map<Integer, Long> positiveSum = sumCount(positive);
		Map<Integer, Long> negativeSum = sumCount(negative);
		
		
		long result = positiveSum.keySet().stream()
				.mapToLong(i -> positiveSum.get(i) * negativeSum.getOrDefault(i, 0L))
				.sum(); // < 2^50
		result = result << zero.length;
		
		// カードが0枚の場合を除く
		result--;

		
		// 出力
		try (PrintWriter out = new PrintWriter(System.out)) {
			out.println(result);
		}

	}
	
	static Map<Integer, Long> sumCount(int[] x) {
		Map<Integer, Long> result = new HashMap<>();
		result.put(0, 1L);
		for (int i: x) {
			List<Integer> keySet = new ArrayList<>(result.keySet());
			keySet.sort((k, l) -> l - k);
			// 大きい方から順番に処理すれば、重複しない。
			for (Integer j : keySet) {
				//iを加える場合
				result.put(j + i, result.getOrDefault(j + i, 0L) + result.get(j));
				
				//iを加えない場合
				//result.put(j, result.get(j) * 2L);
			
			}
		}
		return result;
	}

}
