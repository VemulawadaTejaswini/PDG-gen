import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner((System.in));
		int n = sc.nextInt();
		HashMap<Integer, Integer> red = new HashMap<Integer, Integer>();
		HashMap<Integer, Integer> blue = new HashMap<Integer, Integer>();
		int ans = 0, pre = 0;

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
		
		Object[] redkey = red.keySet().toArray();
		Object[] bluekey = blue.keySet().toArray();
		
		Arrays.sort(redkey);
		Arrays.sort(bluekey);
		
		for (Integer redKey : red.keySet()){
			for (Integer blueKey : blue.keySet()){
				if (blueKey <= pre) {
					continue;
				}
				if (redKey < blueKey) {
					if (red.get(redKey) < blue.get(blueKey)) {
						ans++;
						pre = blueKey;
					}
				}
			}
		}
		
		System.out.println(ans);

		sc.close();
	}
}
