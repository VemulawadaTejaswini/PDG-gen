public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		for (int i=0; i < S.length(); i++) {
			char c = S.charAt(i);
			if (c == 'U')
				continue;
			if (c == 'D')
				continue;
			if (i%2 == 0) {
				if (c == 'R')
					continue;
			}
			else {
				if (c == 'L')
					continue;
			}
			System.out.println("No");
			return;
		}
		System.out.println("Yes");
	}
}
