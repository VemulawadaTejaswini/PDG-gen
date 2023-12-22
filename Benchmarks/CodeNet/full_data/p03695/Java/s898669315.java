import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Set<String> set = new HashSet<>();

		int sum = 0;
		for (int i = 0; i < n; i++) {
			int a = sc.nextInt();
			String s = "";
			if (1 <= a && a <= 399) {
				s = "a";
			} else if (400 <= a && a <= 799) {
				s = "b";
			} else if (800 <= a && a <= 1199) {
				s = "c";
			} else if (1200 <= a && a <= 1599) {
				s = "d";
			} else if (1600 <= a && a <= 1999) {
				s = "e";
			} else if (2000 <= a && a <= 2399) {
				s = "f";
			} else if (2400 <= a && a <= 2799) {
				s = "g";
			} else if (2800 <= a && a <= 3199) {
				s = "h";
			} else {
				sum++;
			}
			if (!"".equals(s) && !set.contains(s)) {
				set.add(s);
			}
		}

		if (set.size() + sum >= 8) {
			System.out.println(set.size() + " 8");
		} else {
			System.out.println(set.size() + " " + (set.size() + sum));
		}

		sc.close();

	}

}