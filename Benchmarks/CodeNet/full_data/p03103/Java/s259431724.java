import java.util.*;

public class Main {

	static class pair implements Comparable<pair>{
		public final long left;
		public final long right;

		public pair(long left, long right) {
			this.left = left;
			this.right = right;
		}
		
		public int compareTo(pair p) {
			if(left > p.left)return 1;
			else if(left < p.left)return -1;
			else return 0;
		}

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), m = sc.nextInt();
		pair a[] = new pair[n];
		for (int i = 0; i < n; ++i) {
			a[i] = new pair(sc.nextLong(), sc.nextLong());
		}
		sc.close();
		Arrays.sort(a);
		long ans = 0, count = 0;
		for (int i = 0; i < n; ++i) {
			long tmp = a[i].right;
			if (count + tmp >= m)
				tmp = m - count;
			count += tmp;
			ans += a[i].left * tmp;
			if (count >= m)
				break;
		}
		System.out.println(ans);

	}

}
