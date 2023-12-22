
import java.util.*;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		//Aiが到着順になるので、Aiを小さい方から順番にソートし、それに出席番号を紐づけておけば良い。
		List<List<Integer>> ll = new ArrayList<List<Integer>>();
		for(int i=0;i<N;i++) {
			List l = new ArrayList<Integer>();
			l.add(i+1);//出席番号
			l.add(sc.nextInt());//到着順
			ll.add(l);
		}
		
		Queue<List<Integer>> pq = 
				new PriorityQueue<List<Integer>>((l1,l2)->Integer.compare(l1.get(1),l2.get(1)));
		
		for(List l:ll) {
			pq.offer(l);
		}
		
		StringBuilder sb = new StringBuilder();
		while(pq.size()>0) {
			sb.append(pq.poll().get(0));
			sb.append(" ");
		}
		System.out.println(sb.toString());
		
	}
}