import java.util.HashMap;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String t = sc.next();
		HashMap<String, String> map1 = new HashMap<String, String>();
		HashMap<String, String> map2 = new HashMap<String, String>();
		String ans = "Yes";

		for (int i = 0; i < s.length(); i++) {
			String c1 = s.substring(i, i + 1);
			String c2 = t.substring(i, i + 1);
			
			if (!c1.equals(c2)) {
				
				if (map1.get(c1) != null) {
					if (!map1.get(c1).equals(c2)) {
						ans = "No";
						break;
					}
				} else {
					map1.put(c1, c2);
				}
				
				if (map2.get(c2) != null) {
					if (!map2.get(c2).equals(c1)) {
						ans = "No";
						break;
					}
				} else {
					map2.put(c2, c1);
				}
			}
		}

		System.out.println(ans);

		sc.close();
	}

}
