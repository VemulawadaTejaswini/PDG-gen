import java.util.*;
public class Main {
	
	public static void main(String... args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		List<String> list = new ArrayList<>(N);
		
		String fast = sc.next();
		list.add(fast);
		
		char last = fast.charAt(fast.length() - 1);
		for (int i = 1; i < N; i++) {
			String w = sc.next();
			if (list.contains(w)) {
				System.out.println("No");
				return;
			}
			list.add(w);
			
			char last_c = w.charAt(w.length() - 1);
			if (last != w.charAt(0)) {
				System.out.println("No");
				return;
			}
			
			last = last_c;
		}
		
		System.out.println("Yes");
	}
}