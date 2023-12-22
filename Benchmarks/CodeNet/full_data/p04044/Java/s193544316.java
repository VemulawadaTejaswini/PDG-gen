import java.util.*;
public class Main {
	public static void main(String arg[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int l = sc.nextInt();
		
		List<String> lst = new ArrayList<>();
		for(int i = 0; i < n; i++) {
			String s = sc.next();
			lst.add(s);
		}
		
		Collections.sort(lst);

		StringBuffer sb = new StringBuffer();
		for(int i = 0; i < n; i++) {
			sb.append(lst.get(i));
		}
		
		System.out.println(sb);
	}
}