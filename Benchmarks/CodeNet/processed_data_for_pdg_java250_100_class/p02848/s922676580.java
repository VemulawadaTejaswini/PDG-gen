public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s = sc.next();
		char[] ch = new char[s.length()];
		for (int i = 0; i < ch.length; i++) {
			ch[i] = s.charAt(i);
		}
		for (int i = 0; i < ch.length; i++) {
			int j = ch[i];
			if (j + n > 90) {
				j = j - 26 + n;
			} else {
				j = ch[i] + n;
			}
			System.out.print((char) (j));
		}
		sc.close();
	}
}
