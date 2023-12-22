import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int[] v = new int[n];

		Map<Integer,Integer> odd = new HashMap<>();
		Map<Integer,Integer> even = new HashMap<>();

		for(int i=0;i<n;i++) {
			v[i] = sc.nextInt();
			if(i%2 == 0) {
				if(even.containsKey(v[i])) {
					int temp = even.get(v[i]);
					temp++;
					even.put(v[i], temp);
				}else {
					even.put(v[i], 1);
				}
			}else {
				if(odd.containsKey(v[i])) {
					int temp = odd.get(v[i]);
					temp++;
					odd.put(v[i], temp);
				}else {
					odd.put(v[i], 1);
				}
			}
		}

		int max_even = Collections.max(even.values());
		int max_odd = Collections.max(odd.values());
		int ans = n - max_even - max_odd;
		if(even.keySet().size() == 1 && odd.keySet().size() == 1 && v[0] == v[1]) ans = n/2;
		System.out.println(ans);
	}

}
