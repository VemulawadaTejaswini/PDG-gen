import java.util.Scanner;

//AtCoder Beginner Contest 154
//B	I miss you...
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		sc.close();

		StringBuilder ans = new StringBuilder();
		for (int i = 0; i < S.length(); i++) {
			ans.append("x");
		}
		System.out.println(ans);
	}
}
