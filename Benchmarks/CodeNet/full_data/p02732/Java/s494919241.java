import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Main{
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int n 	   = Integer.parseInt(scanner.nextLine());
		String[] t = scanner.nextLine().split(" ");
		int[] nlis = new int[n];
		Map<Integer,Integer> map = new HashMap<Integer, Integer>();

		for(int i = 0; i < n; i++) {

			nlis[i] = Integer.parseInt(t[i]);

			map.merge(nlis[i], 1, Integer::sum);
		}

		long ans = 0;
		for(Entry<Integer, Integer> e : map.entrySet()) {

			int x = e.getValue();

			ans += x * (x - 1) / 2 ;
		}


		for(int i = 0; i < n; i++) {

			int x = map.get(nlis[i]);
			System.out.println(ans - x * (x - 1) / 2 + (x - 1) * (x - 2) / 2);
		}
	}
}