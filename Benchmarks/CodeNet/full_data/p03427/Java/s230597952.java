import java.util.*;
public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String N = sc.next();
		System.out.println(Integer.parseInt(N.substring(0, 1)) - 1 + (N.length() - 1) * 9);
	}
}
