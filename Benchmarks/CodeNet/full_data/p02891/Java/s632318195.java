import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char c[] = sc.next().toCharArray();
		int n = Integer.parseInt(sc.next());
		int conti = calcConti(c);
		System.out.println((long) conti * n);
	}

	static int calcConti(char[] c) {
		int count = 0;
		for (int i = 0; i < c.length - 1; i++) {
			if (c[i] == c[i + 1]) {
				count++;
				i++;
			}
		}
		return count;
	}

}
