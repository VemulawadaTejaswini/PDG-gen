import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int K = sc.nextInt();

		int[] a = new int[N];
		int[] b = new int[N];
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		for (int i = 0; i < N; i++) {
			a[i] = sc.nextInt();
			b[i] = sc.nextInt();
		}

		for (int i = 0; i < N; i++) {
			int value = b[i];
			if (map.containsKey(a[i])) {
				value += (int)map.get(a[i]);
			}
			map.put(a[i], value);
		}
		
		Arrays.sort(a);
		
		for (int i = 0; i < a.length; i++) {
			
			K -= (int)map.get(a[i]);
			if (K <= 0) {
				System.out.println(a[i]);
				return;
			}
		}		
	}
}