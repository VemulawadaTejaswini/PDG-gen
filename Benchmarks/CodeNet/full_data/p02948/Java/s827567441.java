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
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		int m = Integer.parseInt(sc.next());
		Map<Integer,Integer> a = new HashMap<>();
		Map<Integer,Integer> b = new HashMap<>();
		int count = 0; int d = 0;
		for(int i = 0; i < n; i++) {
			a.put(i,Integer.parseInt(sc.next()));
			b.put(i,Integer.parseInt(sc.next()));
		}
        List<Entry<Integer, Integer>> list_entries = new ArrayList<Entry<Integer, Integer>>(b.entrySet());

        Collections.sort(list_entries, new Comparator<Entry<Integer, Integer>>() {
        	@Override
            public int compare(Entry<Integer, Integer> obj1, Entry<Integer, Integer> obj2) {
                return obj2.getValue().compareTo(obj1.getValue());
            }
        });
        for(Entry<Integer, Integer> entry : list_entries) {

        	if(d > m)break;
        	if( a.get(entry.getKey()) + d <= m) {
        	  count += entry.getValue();
        	  d++;
        	  b.put(entry.getKey(), 0);
          }
        }
        System.out.println(count);
	}

}