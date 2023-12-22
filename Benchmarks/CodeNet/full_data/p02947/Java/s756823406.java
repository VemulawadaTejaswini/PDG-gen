import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	try {
    		int n = sc.nextInt();
    		HashMap<String, Long> histgrams = new HashMap<>();

    		for (int i=0; i<n; i++) {
    			String s = sc.next();
    			HashMap<Character, Long> map = new HashMap<>();
    			for (int j=0; j<s.length(); j++) {
    				Character c = s.charAt(j);
    				if (map.containsKey(c)) {
    					long count = map.get(c);
    					count++;
    					map.put(c,  count);
    				} else {
    					map.put(c, 1L);
    				}
    			}

    			// String mapStr = map.toString();
    			String mapStr = map.entrySet().stream().map(e -> e.getKey() + "=" + e.getValue()).sorted().collect(Collectors.joining(":"));
    			if (histgrams.containsKey(mapStr)) {
    				long count = histgrams.get(mapStr);
    				count++;
    				histgrams.put(mapStr, count);
    			} else {
    				histgrams.put(mapStr, 1L);
    			}
    		}

    		long sum = 0;
    		Iterator<String> it = histgrams.keySet().iterator();
    		while (it.hasNext()) {
    			long count = histgrams.get(it.next());
        		if (count >= 2) {
        			if (count % 2 == 0) {
        				sum += (count / 2) * (count - 1);
        			} else {
        				sum += count * ((count - 1) / 2);
        			}
        		}

    		}

    		System.out.println(sum);
    	} finally {
    		sc.close();
    	}
    }
}



