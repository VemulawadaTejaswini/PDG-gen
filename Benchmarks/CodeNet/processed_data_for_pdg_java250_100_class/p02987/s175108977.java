public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		char[] c = S.toCharArray();
		if (c[0] == c[1] && c[2] == c[3] && c[1] != c[2]) {
			System.out.println("Yes");
		} else if (c[0] == c[2] && c[1] == c[3] && c[2] != c[3]) {
			System.out.println("Yes");
		} else if (c[0] == c[3] && c[1] == c[2] && c[2] != c[3]) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}
