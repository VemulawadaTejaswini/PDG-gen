import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);		
		String s = sc.next();
		int k = sc.nextInt();
		List<String> substring = new ArrayList<String>();
		for (int i=0;i < s.length();i++) {
			for (int j=i+1;j <= s.length();j++) {
				String str = s.substring(i,j);
				if (!substring.contains(str)) substring.add(str);
			}
		}
		Collections.sort(substring);
		System.out.println(substring.get(k-1));
	}
}