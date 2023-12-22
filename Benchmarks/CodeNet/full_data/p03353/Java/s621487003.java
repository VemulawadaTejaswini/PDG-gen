import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int K = sc.nextInt();
		Set<String> set = new TreeSet<>();
		for (int i = 0; i < s.length() ; i++) {
			for (int j = 0 ; j < s.length(); j++) {
				if (i < j && Math.abs(i - j) <= K) {
					set.add(s.substring(i, j));
				}
			}
		}
		Iterator<String> it = set.iterator();
		int i = 0;
		String answer = "";
		while (it.hasNext() && i < K) {
			answer = it.next();
			i++;
		}
		System.out.println(answer);
	}

}
