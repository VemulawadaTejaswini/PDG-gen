import java.util.*;

public class Main {
	public static void main(String... args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int k = sc.nextInt();
		List<String> a = new ArrayList<>();
		for (int i = 1 ; i <= s.length() ; i++) {
			for (int j = 0 ; j <= s.length() - i ; j++) {
				if (!a.contains(s.substring(j, j+i))) a.add(s.substring(j,j+i));
			}
		}
		Collections.sort(a);
		System.out.println(a.get(k-1));
	}
}
