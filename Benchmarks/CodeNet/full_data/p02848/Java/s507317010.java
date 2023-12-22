
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String S = sc.next();
		StringBuilder ret = new StringBuilder();
		for(char c : S.toCharArray()) {
			int ci = c - 'A';
			ci = (ci + N) % 26;
			ret.append((char)('A' + ci));
		}
		System.out.println(ret);
	}
}
