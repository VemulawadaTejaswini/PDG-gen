import java.util.*;
import java.util.Map.Entry;
 
public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		sc.nextLine();
		Map<Integer,Shop> map = new HashMap<Integer,Shop>();
		for(int tmp = 1 ; tmp<=n; tmp++) {
			String s = sc.next();
			int point = sc.nextInt();
			Shop shop = new Shop(s,point);
			map.put(tmp, shop);
		}
		List<Entry<Integer, Shop>> list_entries = new ArrayList<Entry<Integer, Shop>>(map.entrySet());
		
		Collections.sort(list_entries, new Comparator<Entry<Integer, Shop>>() {
	    	  @Override
	    	    public int compare(Entry<Integer, Shop> obj0, Entry<Integer, Shop> obj1) {
	    	        int ret = obj0.getValue().getCity().compareTo(obj1.getValue().getCity());
	    	        if (ret != 0) {
	    				return ret;
	    			}
	    	        return Integer.compare(obj1.getValue().getPoint(), obj0.getValue().getPoint());
	    	    }
	    	});
		
		for(Entry<Integer, Shop> shop :  list_entries) {
			System.out.println(shop.getKey());
		}

	  }
	
	static class Shop {
		private String city;
		
		private int point;

		public Shop(String city, int point) {
			super();
			this.city = city;
			this.point = point;
		}

		public String getCity() {
			return city;
		}


		public int getPoint() {
			return point;
		}

		
	}
}