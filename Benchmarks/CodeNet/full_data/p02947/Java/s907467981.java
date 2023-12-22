import java.util.*;

class Main {
	private static long k(long v) {
		if (v == 0)
			return 0;
		if (v == 1)
			return 1;
		else
			return v * k(v - 1);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		HashMap<String, Long> l = new HashMap<String, Long>();
		for (int i = 0; i < N; i++) {
			String t = sc.next();
			char[] c = t.toCharArray();
			Arrays.sort(c);
			String S = new String(c);

			if (l.containsKey(S)) {
				if (l.get(S) == 0)
					l.put(S, (long) 1);
				l.put(S, l.get(S) + 1);
			} else {
				l.put(S, (long) 0);
			}
		}
		sc.close();
		long co = 0;
		for (String key : l.keySet()) {
			co += k(l.get(key));
			//System.out.println(l.get(key));
		}
		System.out.println(co / 2);
	}

}