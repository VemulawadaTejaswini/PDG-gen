import java.util.*;

class Main {
    public static void main(String... args) {
        int N = IN.nextInt();
		HashSet<String> h = new HashSet<String>();
		boolean flag = true;
		String w1 = IN.next();
		h.add(w1);
		char prev = w1.charAt(w1.length() - 1);
        for (int i = 0; i < N - 1; i++) {
			String w = IN.next();
			if (h.contains(w) || prev != w.charAt(0)) {
				flag = false;
				break;
			} else {
				h.add(w);
				prev = w.charAt(w.length() - 1);
			}
		}
		puts(flag ? "Yes" : "No");
    }
    static final Scanner IN = new Scanner(System.in);
    static <T> void puts(T arg) { System.out.println(arg); }
}
