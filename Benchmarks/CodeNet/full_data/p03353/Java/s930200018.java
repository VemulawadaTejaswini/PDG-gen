import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		int k  = sc.nextInt();
		TreeSet<String> ts = new TreeSet<String>();
		for (int i = 0; i < input.length(); i++) {
			for (int j = i + 1; j <= input.length(); j++) {
				ts.add(input.substring(i, j));
			}
		}
		Iterator<String> it = ts.iterator();
		int idx = 0;
		while (it.hasNext()) {
			if(idx == k-1) {
				System.out.println(it.next());
				break;
			} else
				it.next();
			idx++;
		}
	}
}
