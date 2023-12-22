
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		String s;
		HashMap<String, Boolean> hash=new HashMap<>();
		Scanner sc = new Scanner(System.in);
		s = sc.nextLine();
		int k = sc.nextInt();
		int len=s.length();
		for (int i = 0; i < len; i++) {
			for (int j = i+1; j <= len; j++) {
				hash.put(s.substring(i, j), true);
			}
		}
		List<String> l=new ArrayList<>(hash.keySet());
		Collections.sort(l);
		System.out.println(l.get(k-1));
	}
}