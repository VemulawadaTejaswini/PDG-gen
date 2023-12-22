import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
		int elemsCount = Integer.parseInt(stdin.readLine());
		int[] elems = Stream.of(stdin.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		TreeMap<Integer, Integer> numCount = new TreeMap<Integer, Integer>();
		Arrays.stream(elems).forEach(num -> {
			if(numCount.containsKey(num)) {
				numCount.put(num, numCount.get(num) + 1);
			}else {
				numCount.put(num, 1);
			}
		});
		int ans = 0;
		System.out.println(numCount);
		for(Map.Entry<Integer, Integer> entry: numCount.entrySet()) {
			int num = entry.getKey();
			int count = entry.getValue();
			if(num != count) {
				if (num < count) ans += count - num;
				else ans += count;
			}
		}
		System.out.println(ans);
	}

}