import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		String T = sc.next();
		
		boolean a = result(S,T);
		boolean b = result(T,S);
		
		if(a && b) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
		sc.close();
	}

	private static boolean result(String S, String T) {
		int n = S.length();

		Map<Character, Character> map = new HashMap<Character, Character>();

		for (int i = 0; i < n; i++) {
			char p = S.charAt(i);
			char q = T.charAt(i);

			if (map.get(p) == null) {
				map.put(p, q);
			} else if (map.get(p) != q) {
				return false;
			}
		}
		return true;
	}
}