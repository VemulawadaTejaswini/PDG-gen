public class Main {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int k = kb.nextInt();
		String s = kb.next();
		String q = "";
		for (int i = 0; i < s.length(); i++) {
			if (i < k) {
				q += s.charAt(i);
			} else {
				q += "...";
				break;
			}
		}
		System.out.println(q);
		kb.close();
	}
}
