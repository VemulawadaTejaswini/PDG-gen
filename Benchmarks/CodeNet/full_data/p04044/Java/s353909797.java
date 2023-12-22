import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		int L = Integer.parseInt(sc.next());
		String s[] = new String[N];
		for (int i = 0; i < N; i++) {
	        s[i] = sc.next();
		}
		String result = "";
        Arrays.sort(s, (s1, s2) -> s1.compareTo(s2));
		for (int i = 0; i < N; i++) {
			result += s[i];
		}
		System.out.println(result);
	}
}