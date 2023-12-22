import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		String a = sc.next();
		String b = sc.next();
		String c = sc.next();

		int ans = 0;
		for (int i = 0; i < n; i++) {
			char charA = a.charAt(i);
			char charB = b.charAt(i);
			char charC = c.charAt(i);

			if (charA != charB) {
				if (charB != charC)
					if (charC != charA)
						ans += 2;
					else
						ans++;
				else
					ans++;
			} else {
				if (charB != charC)
					ans++;
			}
		}

		System.out.println(ans);

		sc.close();
	}

}
