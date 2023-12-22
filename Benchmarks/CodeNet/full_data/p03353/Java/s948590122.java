import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		String s = reader.next();
		int K = reader.nextInt();
		String ans = "";
		Set<String> set = new TreeSet<String>();

		for (int i = 1; i <= s.length(); i++) {
			for (int j = 0; j <= s.length() - i; j++) {
				set.add(s.substring(j, j+i));
			}
		}
		Iterator<String> itr = set.iterator();
		int count = 0;
		while (count < K && itr.hasNext()) {
			ans = itr.next();
			count++;
		}

		System.out.print(ans);
		reader.close();
	}
}



