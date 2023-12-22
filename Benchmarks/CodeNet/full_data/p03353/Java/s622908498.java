import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int K = sc.nextInt();

		Set<String> set = new HashSet<>();
		for (int i = 0; i < s.length(); i++) {
			for (int k = 1; k <= K; k++) {
				if(i + k > s.length()) break;
				set.add(s.substring(i, i + k));
			}
		}

		List<String> list = new ArrayList<>();
		list.addAll(set);
		Collections.sort(list);
		System.out.println(list.get(K - 1));
	}
}