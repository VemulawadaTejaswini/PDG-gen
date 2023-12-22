import java.util.*;
public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String N = String.valueOf(sc.nextLong() + 1);
		int l1 = (N.length() - 1) * 9;
		int l2 = Integer.parseInt(N.substring(0, 1)) - 1;
		System.out.println(l1 + l2);
	}
}
