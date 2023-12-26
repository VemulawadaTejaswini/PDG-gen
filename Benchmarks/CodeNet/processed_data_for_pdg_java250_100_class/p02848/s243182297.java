public class Main {
	public static void main(String[] args) {
		String a = "ABCDEFGHIJKLMNOPQRSTUVWXYZABCDEFGHIJKLMNOPQRSTUVWXYZ";
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		String s = kb.next();
		String p = "";
		for (int i = 0; i < s.length(); i++) {
			char b = s.charAt(i);
			int c = a.indexOf(b);
			p += a.charAt(c + n);
		}
		System.out.println(p);
		kb.close();
	}
}
