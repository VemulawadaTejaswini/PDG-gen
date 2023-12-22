import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		String s = sc.next();
		char[] after = s.toCharArray();
		after[k - 1] = s.toLowerCase().toCharArray()[k - 1];
		System.out.println(String.valueOf(after));
	}
}