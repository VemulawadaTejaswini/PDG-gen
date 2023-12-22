import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] c = sc.nextLine().toCharArray();
		StringBuilder sb = new StringBuilder();
		sc.close();
		for(int i = 0;i < c.length;i += 2) {
			sb.append(c[i]);
		}
		System.out.println(sb.toString());
	}
}