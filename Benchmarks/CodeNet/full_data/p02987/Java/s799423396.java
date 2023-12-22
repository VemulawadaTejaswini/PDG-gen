import java.util.HashSet;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		HashSet<String> h = new HashSet<String>();

		String[] s = sc.next().split("");
		String ss = String.join("", s);

		for(int i = 0; i < 4; i++) {
			h.add(s[i]);
		}

		System.out.println(h.size() == 2 && ss.replace(ss.substring(0, 1), "").length() == 2 ? "Yes" : "No");
	}
}