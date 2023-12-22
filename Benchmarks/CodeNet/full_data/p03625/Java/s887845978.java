
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for(int i =  0 ; i < n ; i++) a[i] = sc.nextInt();
		Arrays.sort(a);
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		int x = -1;
		for(int i = n - 1 ; i >= 0; i--) {
			if(!map.containsKey(a[i])) {
				map.put(a[i], 1);
			}
			else {
				map.put(a[i], map.get(a[i]) + 1);
				if(x == -1 && map.get(a[i]) >= 4) {
					System.out.println(1L * a[i] * a[i]);
					return;
				} else if(x != -1 && x != a[i] && map.get(a[i]) >= 2) {
					System.out.println(1L * x * a[i]);
					return;
				} else if(map.get(a[i]) >= 2) {
					x = a[i];
				}
			}
		}
		System.out.println(0);
	}
}