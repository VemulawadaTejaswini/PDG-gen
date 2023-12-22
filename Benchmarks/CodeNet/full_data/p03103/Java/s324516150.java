import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), m = sc.nextInt();
		Map<Long, Long> map = new HashMap<Long, Long>();
		long a[] = new long[n];
		for(int i = 0; i < n; ++i) {
			a[i] = sc.nextLong();
			long b = sc.nextLong();
			map.put(a[i], b);
		}
		sc.close();
		Arrays.sort(a);
		long ans = 0 , count = 0;
		for(int i = 0; i < n; ++i) {
			long tmp = map.get(a[i]);
			if(count + tmp >= m)tmp = m - count;
			count += tmp;
			ans += a[i] * tmp;
			if(count >= m)break;
		}
		System.out.println(ans);
		
	}

}
