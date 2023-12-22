import java.util.Scanner;

class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		sc.close();
		char c[] = s.toCharArray();
		int ans = 0;

		for (int i = 0; i < 3; i++)
			if (c[i] == '1')
				ans=ans+1;

		System.out.println(ans);

	}
}