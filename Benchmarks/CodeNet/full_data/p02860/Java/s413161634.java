import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if (n % 2 == 1) {
			System.out.println("No");
		} else {
			String s = sc.next();
			char[] ch = s.toCharArray();
			String ans = "Yes";
			for (int i = 0; i < n / 2; i++) {
				if (ch[i] != ch[i + n / 2]) {
					ans = "No";
					break;
				}
			}

			System.out.println(ans);
		}
		sc.close();
	}

}
