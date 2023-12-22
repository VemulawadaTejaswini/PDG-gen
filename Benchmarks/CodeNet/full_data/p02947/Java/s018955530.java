import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		Map<String, Integer> map = new HashMap();
		for(int i=0;i<N;i++) {
			char[] chars = sc.next().toCharArray();
			Arrays.sort(chars);
			String sorted = new String(chars);
			if(!map.containsKey(sorted)) {
				map.put(sorted, 1);
			} else {
				map.put(sorted, map.get(sorted)+1);
			}
		}
		int count = 0;
		for(Integer a:map.values()) {
			if(a > 1) {
				count += keisan(a);
			}
		}
		System.out.println(count);
	}
	private static int keisan(int a) {
		return a * (a-1) / 2 ;
	}
}