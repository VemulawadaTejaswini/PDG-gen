import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner((System.in));
		int n = sc.nextInt();
		HashMap<Integer, Integer> red = new HashMap<Integer, Integer>();
		HashMap<Integer, Integer> blue = new HashMap<Integer, Integer>();
		long ans = 0;

		for (int i = 0; i < n; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			red.put(a, b);
		}
		for (int i = 0; i < n; i++) {
			int c = sc.nextInt();
			int d = sc.nextInt();
			blue.put(c, d);
		}
		
		HashMap<Integer, Integer> redSort = red;
		HashMap<Integer, Integer> blueSort = blue;
		
		Object[] redkey = redSort.keySet().toArray();
		Object[] bluekey = blueSort.keySet().toArray();
		
		Arrays.sort(redkey);
		Arrays.sort(bluekey);
		
		for (Integer redKey : redSort.keySet()){
			for (Integer blueKey : blueSort.keySet()){
				if (redKey < blueKey) {
					if (red.get(redKey) < blue.get(blueKey)) {
						ans++;
						red.remove(redKey);
						blue.remove(blueKey);
					}
				}
			}
		}
		
		System.out.println(ans);

		sc.close();
	}
}
