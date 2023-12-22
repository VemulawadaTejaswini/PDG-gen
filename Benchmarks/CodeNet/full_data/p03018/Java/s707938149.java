import java.util.Scanner;

//AtCoder Grand Contest 034
//B	ABC
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.nextLine();

		sc.close();

		int ans = 0;

		S = S.replaceAll("BC", "D");

		int countA = 0;

		for (int i = 0; i < S.length(); i++) {
			if (S.charAt(i) == 'A') {
				countA++;
			} else {
				if (S.charAt(i) == 'D') {
					ans += countA;
				} else {
					countA = 0;
				}
			}
		}

		System.out.println(ans);
	}
}
