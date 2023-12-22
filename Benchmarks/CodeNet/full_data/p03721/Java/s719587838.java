import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		long k = s.nextLong();
		
		int a;
		long b;
		Map<Integer, Long> m = new HashMap<Integer, Long>();
		for(int i = 0; i < n; i++) {
			a = s.nextInt();
			b = s.nextLong();
			if(m.containsKey(a)) {
				m.replace(a, m.get(a)+b);
			}else {
				m.put(a, b);
			}
		}
		
		Object[] ar = m.keySet().toArray(); 
		Arrays.sort(ar);
		
		for(int i : m.keySet()){
			k -= m.get(i);
			if(k <= 0) {
				System.out.println(i);
				break;
			}
		}
	}
}
