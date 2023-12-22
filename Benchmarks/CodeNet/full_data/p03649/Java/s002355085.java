import java.util.*;

public class Main {
 	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		PriorityQueue<Long> queue = new PriorityQueue(new Comparator<Long>() {
		    public int compare(Long l1, Long l2) {
		        long ll1 = l1.longValue();
		        long ll2 = l2.longValue();
		        if (ll1 == ll2) {
		            return 0;
		        } else if (ll1 > ll2) {
		            return -1;
		        } else {
		            return 1;
		        }
		    }
		});
		for (int i = 0; i < n; i++) {
		    queue.add(sc.nextLong());
		}
		long count = 0;
		while (queue.size() > 0) {
		    long x = queue.poll();
		    if (x + count < n) {
		        break;
		    }
		    long time = (x + count) / n;
		    count += time;
		    x -= (n + 1) * time;
		    queue.add(x);
		}
	    System.out.println(count);
	}
}
