import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long K = sc.nextLong();
//		int[] a = new int[N];
//		int[] b = new int[N];
//		int[][] dp = new int[N][K+1];
		HashMap<Long, Long> m = new HashMap<Long, Long>();
		m.put((long)0, (long)0);
		long ans = (long)0;
		for(int i=0; i<N; i++) {
			long a = sc.nextLong();
			long b = sc.nextLong();
			HashMap<Long, Long> nextm = new HashMap<Long, Long>();
			nextm.put((long)0, (long)0);
			for(Map.Entry<Long, Long> e : m.entrySet()) {
				long k = e.getKey();
				long v = e.getValue();
				if((a|k) <= K && m.containsKey(a|k) && b + v > m.get(a|k)) {
					nextm.put(a|k, b+v);
					if(b+v>ans) {
						ans = b+v;
					}
				} else if((a|k) <= K && !m.containsKey(a|k)) {
					nextm.put(a|k, b+v);
					if(b+v>ans) {
						ans = b+v;
					}
				} else {
					nextm.put(k, v);
				}
			}
			m = nextm;
		}
		System.out.println(ans);
		
	}

}
