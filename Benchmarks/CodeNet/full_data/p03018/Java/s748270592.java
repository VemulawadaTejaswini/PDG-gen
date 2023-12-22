import java.util.*;
import java.lang.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int count = 0;
		while (s.contains("ABC")) {
			int tmp = s.lastIndexOf("ABC");
			count++;
			int search = tmp + 3;
			int cl = 0;
			while (search + 1 < s.length()) {
				if (s.charAt(search) == 'B' && s.charAt(search + 1) == 'C') {
					count++;
					search += 2;
					cl++;
				} else {
					break;
				}
			}
			search = tmp - 1;
			int cf = 0;
			while (search >= 0) {
				if (s.charAt(search) == 'A') {
					count++;
					search--;
					cf++;
				} else {
					break;
				}
			}
			s = s.substring(0, tmp - cf) + "BC";
		}
		System.out.println(count);
	}
}
