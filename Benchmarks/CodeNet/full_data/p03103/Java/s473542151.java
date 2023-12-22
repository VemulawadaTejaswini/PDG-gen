import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), m = sc.nextInt();
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		int a[] = new int[n];
		for(int i = 0; i < n; ++i) {
			a[i] = sc.nextInt();
			int b = sc.nextInt();
			map.put(a[i], b);
		}
		sc.close();
		Arrays.sort(a);
		long ans = 0 , count = 0;
		for(int i = 0; i < n; ++i) {
			long tmp = (long)map.get(a[i]);
			if(count + tmp > m)tmp = m - count;
			count += tmp;
			System.out.println(count);
			ans += (long)a[i] * tmp;
			if(count == m)break;
		}
		System.out.println(ans);
		
	}

}
