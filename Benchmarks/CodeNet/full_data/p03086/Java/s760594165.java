import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s= sc.next();

		StringBuilder newS = new StringBuilder("");
		for (char x : s.toCharArray()) {
			if (x == 'A' || x == 'C' || x == 'G' || x == 'T') {
				newS.append(1);
			} else {
				newS.append(0);
			}
		}

		int max = 0;

		for (String x : newS.toString().split("0")) {
			if (max < x.length()) max = x.length();
		}

		System.out.println(max);
		sc.close();
	}
}