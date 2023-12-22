import java.util.Scanner;

//AtCoder Beginner Contest 150
//B - Count ABC
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long N = Long.parseLong(sc.next());
		String S = sc.next();
		sc.close();

		long ans = 0;
		ans = S.split("ABC").length -1;
		System.out.println(ans);
	}
}
