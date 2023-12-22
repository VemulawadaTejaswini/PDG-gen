import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {
 
	static String s;
	static int x;
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			s = sc.next();
			x = sc.nextInt();
 
			Set<String> set = new TreeSet<String>();
			for (int i = 0; i < s.length(); i++) {
				for (int j = 0; j < x; j++) {
					if (i + j + 1 <= s.length()) {
						set.add(s.substring(i, i + j + 1));
					}
				}
			}
			
			int count = 0;
			for (String str : set) {
				if (count + 1 == x) {
					System.out.println(str);
				}
				count++;
			}
		}
	}
}