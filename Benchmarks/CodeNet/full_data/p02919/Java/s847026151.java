import java.util.*;

public class Main {
	Scanner sc;
	int N;
	int[][] P;
	
	public Main() {
		sc = new Scanner(System.in);
	}
	
	private void calc() {
		N = sc.nextInt();
		P = new int[N][2];
		for (int i = 0; i < N; i++) {
			P[i][0] = i;
			P[i][1] = sc.nextInt();
		}
		Arrays.sort(P, (a,b) -> -Integer.compare(a[1],b[1]));
		TreeSet<Integer> t = new TreeSet<>();
		long s = 0;
		for (int i = 0; i < N; i++) {
			int ind = P[i][0];
			t.add(ind);
			Iterator<Integer> tail = t.tailSet(ind, false).iterator();
			int c = tail.hasNext()?tail.next():N;
			int d = tail.hasNext()?tail.next():N;
			Iterator<Integer> head = t.headSet(ind, false).descendingIterator();
			int b = head.hasNext()?head.next():-1;
			int a = head.hasNext()?head.next():-1;
			s += ((long)P[i][1])* ( (c-ind)*(b-a) + (d-c)*(ind-b) );
		}
		System.out.println(s);
	}
	
	public static void main(String[] args) {
		new Main().calc();
	}
}
