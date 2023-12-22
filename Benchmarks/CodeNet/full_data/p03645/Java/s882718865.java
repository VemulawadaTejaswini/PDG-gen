import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] a = new int[m];
		int[] b = new int[m];
		for(int i = 0 ; i < m ; i++) {
			a[i] = sc.nextInt();
			b[i] = sc.nextInt();
		}
		Map<Integer, Integer> endMap = new HashMap<>();
		Map<Integer, Integer> stMap = new HashMap<>();
		for(int i = 0 ; i < m ; i++) {
			if(a[i] == 1) {
				endMap.put(b[i], 1);
			}
			if(b[i] == n) {
				stMap.put(a[i], 1);
			}
		}
		for(int key : endMap.keySet()) {
			if(stMap.containsKey(key)) {
				System.out.println("POSSIBLE");
				return;
			}
		}
		System.out.println("IMPOSSIBLE");
	}
}
