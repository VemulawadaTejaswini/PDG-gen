import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		ArrayList<String> list = new ArrayList<>();
		Map<String, Integer> map = new HashMap<>();
		
		for ( int i = 0; i < n; i++ ) {
			char[] s = in.next().toCharArray();
			Arrays.sort(s);
			String str = new String(s);
			list.add(str);
			
			Integer v = map.get(str);
			map.put(str, v == null ? 1 : v + 1);
		}
		
		long cnt = 0;
		
		for ( Entry<String, Integer> en : map.entrySet() ) {
			Integer n1 = en.getValue();
			cnt += nCr(n1, 2);			
		}
		
		System.out.println(cnt);
		in.close();
	}
	
	private static long nCr(int n, int r) {
		if ( r == 0 ) return 1;
		return n * nCr(n - 1, r - 1) / r;
	}
}
