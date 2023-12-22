
import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	
	static List<Long> L;
	static int cnt = 0;
	static Queue <Long> que;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = Integer.parseInt(sc.next());
		
		L = new ArrayList<Long>();
		que = new PriorityQueue<Long>();
		
		for(long i = 1 ; i <= 9 ;i++) {
			que.add(i);
		}
		while(L.size() < n) {
			int c = (int) (que.peek() % 10);
			long next = que.poll();
			//System.out.println(next);
			for(int i = Math.max(0, c-1) ; i <= Math.min(c+1, 9) ; i++) {
				que.add((long)(next*10+i));
			}
			L.add(next);
		}
		
		System.out.println(L.get(n-1));
	}
	
	
}
