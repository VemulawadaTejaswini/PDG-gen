import java.util.*;

public class Main {
 	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		ArrayDeque<Integer> base = new ArrayDeque<>();
		for (int i = 0; i < n; i++) {
		    base.add(sc.nextInt());
		}
		long max = Integer.MIN_VALUE;
		for (int i = Math.max(k - n, 1); i <= n && i <= k; i++) {
		    for (int j = 0; j <= i; j++) {
		        ArrayDeque<Integer> tmp = (ArrayDeque<Integer>)(base.clone());
		        long value = 0;
		        PriorityQueue<Integer> queue = new PriorityQueue<Integer>();
		        for (int left = 0; left < j; left++) {
		            int x = tmp.pollFirst();
		            value += x;
		            queue.add(x);
		        }
		        for (int right = j; right < i; right++) {
		            int x = tmp.pollLast();
		            value += x;
		            queue.add(x);
		        }
		        for (int add = 0; add < k - i && queue.size() > 0 && queue.peek() < 0; add++) {
		            int x = queue.poll();
		            value -= x;
		        }
		        max = Math.max(value, max);
		    }
		}
	    System.out.println(max);
   }
}


