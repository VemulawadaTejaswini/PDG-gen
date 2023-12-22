
import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] c = new int[n];
		HashMap<Integer,TreeSet<Integer>> map = new HashMap<>();
		for (int i=0;i<=200_000;i++) {
			map.put(i, new TreeSet<Integer>());
		}
		for (int i=0;i<n;i++) {
			c[i]=sc.nextInt();
			map.get(c[i]).add(i);
		}
		
		long[] ans = new long[n];
		ans[0]=1;
		for (int i=1;i<n;i++) {
			ans[i]=ans[i-1];
			if (c[i]!=c[i-1]) {
				for (Integer intg : map.get(c[i]).headSet(i)) {
					if (intg>0) {
						ans[i]+=ans[intg-1];
					} else {
						ans[i]++;
					}
				}
			}
		}
		
		System.out.println(ans[n-1]);
	}
}
