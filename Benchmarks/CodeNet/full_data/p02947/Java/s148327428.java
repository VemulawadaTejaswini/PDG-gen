import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// Nの入力
		int N = sc.nextInt();
		
		// siをソートしてHashMapにputしながら集計
		Map<String, Integer> map = new HashMap<>();
		int sum = 0;
		for (int i = 0; i < N; i++) {
			char[] c = sc.next().toCharArray();
			Arrays.sort(c);
			String s = String.valueOf(c);
			if (map.containsKey(s)) {
				int num = map.get(s);
				sum += num;
				map.put(s, num+1);
			}
			else {
				map.put(s,1);
			}
		}
		
		// 結果の出力
		System.out.println(sum);
		
		sc.close();
	}

}
