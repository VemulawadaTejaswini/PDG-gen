
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		Set<String>used=new HashSet<String>();

		String s = sc.next();
		used.add(s);
		for (int i = 1; i < N; i++) {
			String t = sc.next();
			if (used.contains(t)) {
				System.out.println("No");
				break;
			}else {
				used.add(t);
			}
			if (s.charAt(s.length()-1) != t.charAt(0)) {
				System.out.println("No");
				break;
			}
			if (i == N-1) {
				System.out.println("Yes");
			}
			s=t;
		}

	}
}

