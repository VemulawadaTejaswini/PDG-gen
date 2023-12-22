import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int l = sc.nextLine().length();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < l; i++) {
			sb.append("x");
		}
		System.out.println(sb.toString());
	}
}
