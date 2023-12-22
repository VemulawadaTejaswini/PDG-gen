import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] s = sc.next().toCharArray();
		System.out.println((s[0] == s[1] || s[1] == s[2] || s[2] == s[3]) ? "Bad" : "Good");
	}
}