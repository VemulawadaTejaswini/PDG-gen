import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		Shop[] arr = new Shop[n];
		for (int i = 0; i < n; i++) {
		    arr[i] = new Shop(sc.nextInt(), sc.nextInt());
		}
		Arrays.sort(arr);
		long total = 0;
		for (Shop s : arr) {
		    total += Math.min(m, s.count) * (long)(s.cost);
		    m -= s.count;
		    if (m < 0) {
		        break;
		    }
		}
		System.out.println(total);
	}
	
	static class Shop implements Comparable<Shop> {
	    int cost;
	    int count;
	    
	    public Shop(int cost, int count) {
	        this.cost = cost;
	        this.count = count;
	    }
	    
	    public int compareTo(Shop s) {
	        return this.cost - s.cost;
	    }
	}
}
