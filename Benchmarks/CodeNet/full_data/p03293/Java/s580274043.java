import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Integer> n = new ArrayList<Integer>();
		String s = sc.next();
		String t = sc.next();

		boolean flag = false;
		for (int i = 0; i < s.length(); i++) {
			s = s.substring(1, s.length()) + s.substring(0, 1);
			if (s.equals(t)) {
				flag = true;
				break;
			}
		}

		if (flag) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		sc.close();
	}

}
