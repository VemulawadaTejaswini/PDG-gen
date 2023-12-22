import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		String ans = "";
		for (int i = 0; i < 3; i++) {
			char[] c = sc.next().toCharArray();
			ans += c[i];
		}
		System.out.println(ans);
		sc.close();
	}
}