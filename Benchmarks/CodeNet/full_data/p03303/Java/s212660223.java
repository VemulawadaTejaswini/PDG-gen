import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		char[] s = sc.next().toCharArray();
		int w = sc.nextInt();
		for (int i = 0; i < s.length; i = i + w) {
			sb.append(s[i]);
		}
		System.out.println(sb);
	}
}