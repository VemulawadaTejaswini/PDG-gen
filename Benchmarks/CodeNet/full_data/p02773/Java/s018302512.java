import java.util.*;

class Main {
	Scanner sc;
	int N;
	Map<String, Integer> map;
	
	private void calc() {
		sc = new Scanner(System.in);
		N = sc.nextInt();
		map = new TreeMap<>();
		int max = -1;
		for (int i = 0; i < N; i++) {
			String s = sc.next();
			int c = map.getOrDefault(s, 0) + 1;
			max = Math.max(max, c);
			map.put(s, c);
		}
		for (String s : map.keySet()) {
			if (map.get(s) == max) System.out.println(s);
		}
	}

	public static void main(String[] args) {
		new Main().calc();
	}
}
