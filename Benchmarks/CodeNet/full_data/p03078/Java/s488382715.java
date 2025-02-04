import java.util.*;
class Main {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int X = Integer.parseInt(sc.next());
	int Y = Integer.parseInt(sc.next());
	int Z = Integer.parseInt(sc.next());
	int K = Integer.parseInt(sc.next());

	Long[] A = new Long[X];
	Long[] B = new Long[Y];
	Long[] C = new Long[Z];

	for(int i = 0; i<X; i++) A[i] = Long.parseLong(sc.next());
	for(int i = 0; i<Y; i++) B[i] = Long.parseLong(sc.next());
	for(int i = 0; i<Z; i++) C[i] = Long.parseLong(sc.next());

	PriorityQueue<Long> pq = new PriorityQueue<Long>(K);
	for(int i = 0; i<K; i++) pq.add(0L);

	int cnt = 0;
	for(int i = 0; i<X; i++) {
	    for(int j = 0; j<Y; j++) {
		for(int l = 0; l<Z; l++) {
		    long sum = A[i]+B[j]+C[l];
		    if(sum > pq.peek()) {
			pq.poll();
			pq.add(sum);
		    }
		}
	    }
	}

	Long[] ans = pq.toArray(new Long[0]);
	Arrays.sort(ans, Comparator.reverseOrder());
	for(int i = 0; i<K; i++) System.out.println(ans[i]);

    }
}