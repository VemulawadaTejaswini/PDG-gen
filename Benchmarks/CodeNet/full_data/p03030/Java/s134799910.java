import java.util.Comparator;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		Map<String, Map<Integer, Integer>> ans  = new TreeMap<>();

		int N  = scan.nextInt();

		for(int i = 0; i< N; i++) {
			String str = scan.next();
			int n = scan.nextInt();
			if(!ans.containsKey(str)) {
				ans.put(str, new TreeMap<>(Comparator.reverseOrder()));
			}

			ans.get(str).put(n, n + 1);
		}

		for(Map.Entry<String, Map<Integer, Integer>> e: ans.entrySet()) {
			for(Map.Entry<Integer,  Integer>ee: e.getValue().entrySet()) {
				System.out.println(ee.getValue());
			}
		}


	}
}