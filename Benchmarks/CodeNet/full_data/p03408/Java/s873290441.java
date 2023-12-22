import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;

class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		TreeMap<String, Integer> blue = new TreeMap<String, Integer>();
		TreeMap<String, Integer> red = new TreeMap<String, Integer>();

		int N = sc.nextInt();
		for(int i = 0; i < N; i++) {
			String s = sc.next();
			if(blue.containsKey(s)) {
				blue.replace(s, blue.get(s) + 1);
			}else {
				blue.put(s, 1);
			}
		}

		int M = sc.nextInt();
		for(int i = 0; i < M; i++) {
			String t = sc.next();
			if(red.containsKey(t)) {
				red.replace(t, blue.get(t) + 1);
			}else {
				red.put(t, 1);
			}
		}

		int X = 0;
		while(!blue.isEmpty()) {
			Entry<String, Integer> s = blue.pollFirstEntry();
			X = Math.max(X, s.getValue() - ((red.containsKey(s.getKey()) ? red.get(s.getKey()) : 0)));
		}
		System.out.println(X);
	}
}