
import java.util.*;

public class Main {

	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}

	public void run() {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		long a[] = new long[3*n];
		for(int i=0; i<3*n; i++) {
			a[i]=sc.nextLong();
		}

		PriorityQueue<Long> pq1 = new PriorityQueue<>();//前
		ArrayList<Long> tmp1 = new ArrayList<Long>();
		{
			long sum1 = 0;
			for(int i=0; i<n; i++) {
				pq1.add(a[i]);
				sum1+= a[i];
			}

			tmp1.add(sum1);
			for(int i=n; i<2*n; i++) {
				pq1.add(a[i]);
				sum1 += a[i];
				sum1 -= pq1.poll();
				tmp1.add(sum1);
			}
		}
		PriorityQueue<Long> pq2 = new PriorityQueue<>(Collections.reverseOrder());
		ArrayList<Long> tmp2 = new ArrayList<Long>();
		{
			long sum1 = 0;
			for(int i=3*n-1; i>=2*n; i--) {
				pq2.add(a[i]);
				sum1+= a[i];
			}

			tmp2.add(sum1);
			for(int i=2*n-1; i>=n; i--) {
				pq2.add(a[i]);
				sum1 += a[i];
				sum1 -= pq2.poll();
				tmp2.add(sum1);
			}
		}
		long ans = -Long.MAX_VALUE;
		for(int i=0; i<=n; i++) {
			ans = Math.max(ans, tmp1.get(i) - tmp2.get(n-i))  ;
		}
		System.out.println(ans);
		sc.close();
	}


}
