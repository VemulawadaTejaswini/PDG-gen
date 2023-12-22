import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int q = sc.nextInt();
		String s= sc.next();

		for (int i = 0; i < q; i++) {
			String newS = s.substring(sc.nextInt() - 1, sc.nextInt());
			System.out.println((newS.length() - newS.replace("AC", "").length()) / 2);
		}

		sc.close();
	}
}