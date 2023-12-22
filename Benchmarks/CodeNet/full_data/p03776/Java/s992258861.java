
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}

	public void run() {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int a=sc.nextInt();
		int b=sc.nextInt();
		long v[] = new long[n];
		for(int i=0; i<n; i++) {
			v[i]=sc.nextLong();
		}

		Arrays.sort(v);

		Map<Long, Integer> m = new HashMap<Long, Integer>();
		for(int i=0; i<n; i++) {
			m.put(v[i], m.containsKey(v[i]) ? m.get(v[i])+1 : 1);
		}

		double max=0;
		for(int i=n-1; i>n-a-1; i--) {
			max += v[i];
		}
		max /= a;

		long ans = 0;
		for(int i=a; i<=b; i++) {
			double t = 0;
			Map<Long, Integer> tmp = new HashMap<Long, Integer>();
			for(int j=n-1; j>n-i-1; j--) {
				t += v[j];
				tmp.put(v[j], tmp.containsKey(v[j]) ? tmp.get(v[j])+1 : 1);
			}
			if(max == t/i) {
				int x = m.get(v[n-i]);
				int y = tmp.get(v[n-i]);
				ans += combi(x,y);
			}
		}
		System.out.println(max);
		System.out.println(ans);
		sc.close();

	}

	private long combi(int x, int y) {
		long res = 1;
		for(int i=0; i<y; i++) {
			res *= (x-i);
			res /= (i+1);
		}
		return res;
	}
}


