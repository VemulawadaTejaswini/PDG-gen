import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		String n = sc.next();
		int count = 0;
		for (char c : n.toCharArray()) {
			if (c == '2') {
				count++;
			}
		}
		System.out.println(count);
	}
}
