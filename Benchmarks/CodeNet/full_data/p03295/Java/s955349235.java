
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int M = sc.nextInt();

		Set s[] = new HashSet[N];
		for (int j = 0; j < N ; j++) {
			Set ss = new HashSet();
			s[j]=ss;
		}
		for (int i = 0; i < M; i++) {
			int a = sc.nextInt() - 1;
			int b = sc.nextInt() - 1;
			s[a].add(b);
		}

		int hashi = 0;
		for (int j = 0; j < N - 1; j++) {
			if (s[j].contains(j+1)) {
			} else {
				for (Iterator<String> i = s[j].iterator(); i.hasNext();) {
					s[j + 1].add(i.next());
				}
				hashi += 1;
			}
		}
		System.out.println(N - 1 - hashi);
	}
}