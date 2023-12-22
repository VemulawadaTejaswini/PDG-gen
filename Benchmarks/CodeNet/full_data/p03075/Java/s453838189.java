import java.util.*;
import java.math.BigDecimal;
public class Main {

	public static void main (String[] args){
	
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		int e = sc.nextInt();
		int k = sc.nextInt();
		
		HashMap<String, Integer> list1 = new HashMap<String, Integer>();
		HashMap<String, Integer> list2 = new HashMap<String, Integer>();
		
		list1.put("a", a);
		list1.put("b", b);
		list1.put("c", c);
		list1.put("d", d);
		list1.put("e", e);

		list2.put("a", a);
		list2.put("b", b);
		list2.put("c", c);
		list2.put("d", d);
		list2.put("e", e);
		
		boolean result = true;
        for(Map.Entry<String, Integer> e1 : list1.entrySet()) {
            final String key1 = e1.getKey();
        	final Integer value1 = e1.getValue();
        	
        	for (Map.Entry<String, Integer> e2 : list2.entrySet()) {
            	final String key2 = e2.getKey();
        		final Integer value2 = e2.getValue();
        		
        		if (key1.equals(key2)) {
        			continue;
        		}
        		
        		if (((BigDecimal.valueOf(value1)).abs().subtract((BigDecimal.valueOf(value2)).abs())).compareTo(BigDecimal.valueOf(k)) > 0) {
        			result = false;
        		}
        		
        	}
        }
		
		if (result) {
			System.out.println("Yey!");
		} else {
			System.out.println(":(");
		}
	}

}