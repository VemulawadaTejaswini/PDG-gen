import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int v[] = new int[n];

		for (int i=0; i<n; i++){
			v[i] = sc.nextInt();
		}
		HashMap<Integer, Integer>odd = new HashMap<Integer, Integer>();
		HashMap<Integer, Integer>even = new HashMap<Integer, Integer>();

		for (int i=0; i<n; i++){
			if (i % 2 != 0){
				// 数列の偶数番目の処理
				if (even.containsKey(v[i])){
					even.put(v[i], even.get(v[i]) + 1);
				} else {
					even.put(v[i], 1);
				}
			} else {
				// 数列の奇数番目の処理
				if (odd.containsKey(v[i])){
					odd.put(v[i], odd.get(v[i]) + 1);
				} else {
					odd.put(v[i], 1);
				}
			}
		}
		List<Entry<Integer, Integer>> oddEntries = new ArrayList<Entry<Integer, Integer>>(odd.entrySet());

		Collections.sort(oddEntries, new Comparator<Entry<Integer,Integer>>() {
			public int compare(Entry<Integer, Integer> obj1, Entry<Integer, Integer> obj2){
				return obj2.getValue().compareTo(obj1.getValue());
			}
		});

		List<Entry<Integer, Integer>> evenEntries = new ArrayList<Entry<Integer, Integer>>(even.entrySet());

		Collections.sort(evenEntries, new Comparator<Entry<Integer,Integer>>() {
			public int compare(Entry<Integer, Integer> obj1, Entry<Integer, Integer> obj2){
				return obj2.getValue().compareTo(obj1.getValue());
			}
		});
		int oddMode = oddEntries.get(0).getKey();
		int oddModeCnt = oddEntries.get(0).getValue();
		int evenMode = evenEntries.get(0).getKey();
		int evenModeCnt = evenEntries.get(0).getValue();
		int ans = 0;
		if (oddMode != evenMode){
			ans = n - (oddModeCnt + evenModeCnt);
			System.out.println(ans);
		} else {
			if (oddEntries.size() == 1){
				ans = n - (oddModeCnt);
			} else {
				int ans1 =0;
				int ans2 =0;
				ans1 = n - (oddModeCnt + evenEntries.get(1).getValue());
				ans2 = n - (oddEntries.get(1).getValue() + evenModeCnt);
				ans = Math.min(ans1, ans2);
			}
			System.out.println(ans);
		}
	}
}