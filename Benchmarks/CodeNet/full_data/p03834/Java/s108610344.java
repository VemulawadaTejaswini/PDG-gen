import java.util.Scanner;

public class ABC051A {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] s = sc.next().split(",");
		sc.close();
		StringBuilder sb = new StringBuilder();
		sb.append(s[0] + " ");
		sb.append(s[1] + " ");
		sb.append(s[2]);
		System.out.println(sb.toString());
	}
}