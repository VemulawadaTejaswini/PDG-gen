import java.io.PrintWriter;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
	
	public static void main(String[] args) {
		// 入力
		final String w;
		try(Scanner scan = new Scanner(System.in)) {
			w = scan.next();	// 1≤|w|≤100
		}
		
		// 文字charに対応するIntegerごとに集計
		Map<Integer, List<Integer>> map = IntStream.range(0, w.length()).map(i -> w.charAt(i)).boxed()
				.collect(Collectors.groupingBy(i -> i));
			
		boolean result =map.keySet().stream().allMatch(key  -> map.get(key).size() % 2 == 0);
		
		// 出力
		try (PrintWriter out = new PrintWriter(System.out)) {
			out.println(result ? "Yes" : "No");
		}

	}

}