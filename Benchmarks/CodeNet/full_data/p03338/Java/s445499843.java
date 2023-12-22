
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s = sc.next();
		int ans = 0;
		for(int i = 1; i < n; i++) {
			Set<Character> a = new HashSet<>();
			Set<Character> b = new HashSet<>();
			for(int j = 0; j < i; j++) {
				a.add(s.charAt(j));
			}
			for(int j = i; j < n; j++) {
				b.add(s.charAt(j));
			}
			b.retainAll(a);
			ans = Math.max(ans, b.size());
		}
		System.out.println(ans);
	}

}
