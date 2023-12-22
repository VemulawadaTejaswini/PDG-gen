import java.math.BigDecimal;
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
		Map<Integer, Integer[]> map = new HashMap<Integer, Integer[]>();

		Scanner sc = new Scanner(System.in);
		int length = Integer.parseInt(sc.nextLine());

		for (int count = 0; count < length; count++) {
			String point[] = sc.nextLine().split(" ");
		    Integer points[] = new Integer[]{Integer.parseInt(point[0]),Integer.parseInt(point[1])};
            map.put(count, points);
		}

        List<Entry<Integer, Integer[]>> list_entries = new ArrayList<Entry<Integer, Integer[]>>(map.entrySet());
        Collections.sort(list_entries, new Comparator<Entry<Integer, Integer[]>>() {
            public int compare(Entry<Integer, Integer[]> obj1, Entry<Integer, Integer[]> obj2) {
                // 4. 昇順
            	Integer sum1 = obj1.getValue()[0] + obj1.getValue()[1];
            	Integer sum2 = obj2.getValue()[0] + obj2.getValue()[1];
                return sum1.compareTo(sum2) * -1;
            }
        });

        int idx = 0;
        BigDecimal sum1 = BigDecimal.ZERO;
        BigDecimal sum2 = BigDecimal.ZERO;
        for (Entry<Integer, Integer[]> entry : list_entries) {
        	if (idx % 2 == 0) {
        		sum1 = sum1.add(new BigDecimal(entry.getValue()[0]));
        	} else {
        		sum2 = sum2.add(new BigDecimal(entry.getValue()[1]));
        	}
        	idx++;
        }

		System.out.println(sum1.subtract(sum2));
	}

}