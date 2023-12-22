import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		scan.nextLine();
		String s = scan.nextLine();
		int t = scan.nextInt();
		char[] str = s.toCharArray();
		
		while (t-- > 0) {
			int type = scan.nextInt();
			if (type == 1) {
				int pos = scan.nextInt()-1;
				String ch = scan.next();
				str[pos] = ch.charAt(0);
			} else {
				int start = scan.nextInt()-1;
				int end = scan.nextInt();
				Set<Character> myset = new HashSet<Character>();
				for (int i = start; i < end; i++) {
					if (!myset.contains(str[i])) {
						myset.add(str[i]);
					}
				}
				System.out.println(myset.size());
			}
		}
		
	}

}