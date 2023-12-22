import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		int N = scan.nextInt();

		// mapにkeyとvalue格納
		for(int i = 0; i < N; i++) {
			map.put(i + 1, scan.nextInt());
		}

		List<Entry<Integer, Integer>> list = new ArrayList<Entry<Integer, Integer>>(map.entrySet());

		//昇順ソート
		Collections.sort(list, new Comparator<Entry<Integer, Integer>>() {
			public int compare(Entry<Integer, Integer> obj1, Entry<Integer, Integer> obj2) {
				return obj1.getValue().compareTo(obj2.getValue());
			}
		});
		for (Entry<Integer, Integer> entry : list) {
			//System.out.println(entry.getKey() + " : " + entry.getValue());
			System.out.print(entry.getKey()+ " ");
		}

	}
}