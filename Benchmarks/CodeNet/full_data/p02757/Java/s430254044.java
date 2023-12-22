

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int p = sc.nextInt();
		String s = sc.next();
	
		if (p==2 || p==5) {
			long ans = 0;
			for (int i=0;i<n;i++) {
				if ((s.charAt(i)-'0')%p==0) {
					ans+=(i+1);
				}
			}
			System.out.println(ans);
			
		} else {
			HashMap<Integer, Long> map = new HashMap<>();
			int rem = 0;
			map.put(0, 1L);
			for (int i=n-1; i>=0; i--) {
				rem=(10*rem+s.charAt(i)-'0')%p;
				if (!map.containsKey(rem)) {
					map.put(rem, 0L);
				}
				map.put(rem, map.get(rem)+1);
			}
			
			long ans = 0;
			for(Map.Entry<Integer, Long> e : map.entrySet()) {
				ans += e.getValue()*(e.getValue()-1)/2;
			}
			System.out.println(ans);
		}

		
	}
	
}


