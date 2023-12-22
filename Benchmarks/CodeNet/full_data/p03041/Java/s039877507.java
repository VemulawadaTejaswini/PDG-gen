import java.util.Scanner;

//AtCoder Beginner Contest 126
//A	Changing a Character
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		sc.nextLine();
		String S = sc.nextLine();

		sc.close();

		String ans = "";
		for (int i = 0; i < N; i++) {
			if (i == K - 1) {
				ans = ans + String.valueOf((char)(S.charAt(i) + 32));
			} else {
				ans = ans + S.charAt(i);
			}

		}
		System.out.print(ans);
	}
}
