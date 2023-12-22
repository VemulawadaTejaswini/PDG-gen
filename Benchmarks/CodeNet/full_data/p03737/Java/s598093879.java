import java.util.*;
 
public class Main {
	static Scanner scanner = new Scanner(System.in);
 
	public static void main(String[]$) {
		String a = scanner.next();
		String b = scanner.next();
		int compare1 = Integer.compare(a.length(), b.length());
		int compare2 = a.compareTo(b);
		if (a.equals(b)) {
			System.out.println("EQUAL");
        } else if (compare1 == 0) {
			System.out.println(0 < compare2 ? "GREATER" : "LESS");
		} else {
			System.out.println(0 < compare1 ? "GREATER" : "LESS");
		}
	}
}