import java.util.HashSet;
import java.util.Scanner;

public class Main {
	void run() {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		while (t-- != 0) {
			long a = scan.nextLong();
			long b = scan.nextLong();
			long c = scan.nextLong();
			long d = scan.nextLong();
			System.out.println(eval(a, b, c, d) ? "Yes" : "No");
		}
	}
	boolean eval(long a, long b, long c, long d) {
		if (a < b)
			return false;
		long juice = a % b;
		String str = String.valueOf(juice) + " ";
		HashSet<String> hash = new HashSet<String>();
		while (juice >= 0) {
			if (str.length() == 4 && str.charAt(0) == str.charAt(2))
				return true;
			if (juice <= c) {
				juice += d - b;
				str += String.valueOf(juice) + " ";
			} else {
				juice -= b;
//				System.out.println("str: " + str);
				if (hash.contains(str))
					return true;
				else
					hash.add(str);
				str = "";
			}
		}
		return false;
	}
	public static void main(String[] args) {
		new Main().run();
	}
}
