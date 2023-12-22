import java.util.*;
import java.lang.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int count = 0;
		while (s.contains("ABC")) {
			int tmp = s.indexOf("ABC");
			s = s.substring(0, tmp) + "BCA" + s.substring(tmp + 3);
			count++;
		}
		System.out.println(count);
	}
}
