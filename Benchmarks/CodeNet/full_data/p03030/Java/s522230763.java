import java.util.*;
 
public class Main {
	
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int N = sc.nextInt();
    	Map<String, Map<Integer, Integer>> shop = new HashMap<>();
    	for (int i = 1; i < N+1; i++) {
    		String city = sc.next();
    		int point = sc.nextInt();
    		if (shop.containsKey(city)) {
    			shop.get(city).put(point, i);
    		} else {
    			Map<Integer, Integer> order = new HashMap<>();
    			order.put(point, i);
    			shop.put(city, order);
    		}
    	}
    	StringBuilder sb = new StringBuilder();
    	List<String> key = new ArrayList<>(shop.keySet());
    	Collections.sort(key);
    	for (int i = 0; i < key.size(); i++) {
    		Map<Integer, Integer> cityShop = shop.get(key.get(i));
        	List<Integer> pointKey = new ArrayList<>(cityShop.keySet());
        	Collections.sort(pointKey, Collections.reverseOrder());
        	for (int point : pointKey) {
        		sb.append(cityShop.get(point)).append("\n");
        	}
    	}
    	System.out.println(sb);
    }
}