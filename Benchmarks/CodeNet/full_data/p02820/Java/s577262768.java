import java.util.HashMap;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}

	public void run() {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		long r=sc.nextLong();
		long s=sc.nextLong();
		long p=sc.nextLong();
		String t=sc.next();
		HashMap<String, Long> map = new HashMap<String, Long>();
		map.put("r", p);
		map.put("s", r);
		map.put("p", s);

		HashMap<String, String> map2 = new HashMap<String, String>();
		map2.put("r", "p");
		map2.put("s", "r");
		map2.put("p", "s");

		long ans = 0;

		for(int i=0; i<k; i++) {
			String prev = null;
			for(int j=i; j<n; j+=k) {
				if(prev == null) {
					ans += map.get(t.substring(j, j+1));
					prev = map2.get(t.substring(j, j+1));
				} else if(! map2.get(t.substring(j, j+1)).equals(prev)) {
					ans += map.get(t.substring(j, j+1));
					prev = map2.get(t.substring(j, j+1));
				} else {
					prev = t.substring(j, j+1);
				}
			}
		}
		System.out.println(ans);
		sc.close();
	}
}
