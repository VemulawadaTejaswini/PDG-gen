import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		boolean isHitachi = s.matches("^(hi)+$");
		String ans = isHitachi ? "Yes" : "No";
		System.out.println(ans);
		sc.close();
	}
}
