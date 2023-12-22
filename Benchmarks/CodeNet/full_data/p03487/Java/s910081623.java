import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	void run() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		int ans = 0;
		Map<Integer, Integer> mp = new HashMap<>();
		for(int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
			if(mp.get(a[i]) == null)mp.put(a[i], 1);
			else mp.put(a[i], mp.get(a[i])+1);
		}
		for(int i : mp.keySet()) {
			if(mp.get(i)>i) ans += mp.get(i) - i;
			else if(mp.get(i) < i) ans += mp.get(i);
		}
		System.out.println(ans);
		
		
		sc.close();
	}

	void debug(Object... o) {
		System.out.println(Arrays.deepToString(o));
	}

	public static void main(String[] args) {
		new Main().run();
	}
}