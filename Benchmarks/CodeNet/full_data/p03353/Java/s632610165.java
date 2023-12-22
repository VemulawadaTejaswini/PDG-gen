import java.util.*;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int k = sc.nextInt();
		List<String> subs = new ArrayList<String>();
		for(int i = 1; i <= s.length(); i++) {
			for(int j = 0; j + i <= s.length(); j++) {
				if(!(subs.contains(s.substring(j, j + i)))) subs.add(s.substring(j, j + i));
			}
		}
		Collections.sort(subs);
		System.out.println(subs.get(k - 1));
	}
}