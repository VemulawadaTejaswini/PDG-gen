import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String S = sc.next();
		int count = 0;
		char beforeS = S.charAt(0);

		for (int i = 1; i < N; i++) {
			char nowS = S.charAt(i);
			if (beforeS == nowS) {
				count++;
			}
			beforeS = nowS;
		}
		System.out.println(N - count);

		sc.close();
	}
}