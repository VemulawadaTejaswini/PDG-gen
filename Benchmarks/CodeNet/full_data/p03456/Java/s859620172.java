import java.util.*;

public class Main {
	public static void main(String... args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String b = sc.next();
		int c = Integer.valueOf(a+b);
		System.out.println(Math.sqrt(c) == Math.ceil(Math.sqrt(c)) ? "Yes" : "No");
	}
}
