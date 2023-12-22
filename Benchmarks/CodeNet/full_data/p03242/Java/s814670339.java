import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();

		String[] s = sc.next().split("");

		for(int i = 0; i < s.length; i++) {
			sb.append(s[i].equals("1") ? "9" : "1");
		}

		System.out.println(sb);
	}
}