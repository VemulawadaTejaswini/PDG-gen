public class Main {
	static String[] w = { "SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT" };
	public static void main(String[] args) {
		Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		int n = in.nextInt();
		String s = in.next();
		for (int i = 0; i < s.length(); i++) {
			int x = s.charAt(i) - 'A';
			x += n;
			if (x >= 26)
				x -= 26;
			System.out.print((char) ('A' + x));
		}
		System.out.println();
	}
}
