import java.util.*;
 
public class Main {
	
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int N = sc.nextInt();
    	int M = sc.nextInt();
    	Map<Long, Long> shop = new HashMap<>();
    	for (int i = 0; i < N; i++) {
    		long cost = sc.nextInt();
    		long count = sc.nextInt();
    		if (shop.containsKey(cost)) {
    			shop.put(cost, shop.get(cost) + count);
    		} else {
    			shop.put(cost, count);
    		}
    	}
    	List<Long> key = new ArrayList<>(shop.keySet());
    	Collections.sort(key);
    	long rem = M;
    	long totalCost = 0;
    	for (int i = 0; i < key.size(); i++) {
    		long cost = key.get(i);
    		long count = shop.get(cost);
    		if (count < rem) {
    			rem -= count;
    			totalCost += count * cost;
    		} else {
    			totalCost += rem * cost;
    			break;
    		}
    	}
    	System.out.println(totalCost);
    }
}