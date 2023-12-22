import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner((System.in));
		String s = sc.next();
		int K = sc.nextInt();
		String ans = "";
		TreeMap<String, String> a = new TreeMap<String, String>();

		for (int i = 0; i < s.length(); i++) {
			for (int j = i + 1; j <= s.length(); j++) {
				a.put(s.substring(i, j), "");
			}
		}
		
		Iterator<String> it = a.keySet().iterator();
		for (int i = 0; i < K; i++) {
				ans = it.next();
		}

		System.out.println(ans);

		sc.close();
	}
}
