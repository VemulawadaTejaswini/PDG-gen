public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String s1, s2, checkStr;
		boolean ans = false;
		int s1Length, s2Length;
		s1 = in.readLine();
		s2 = in.readLine();
		s1Length = s1.length();
		s2Length = s2.length();
		for (int i = 0; i < s1Length; i++) {
			if (s1.charAt(i) == s2.charAt(0)) {
				if ((i + 1) + s2Length > s1Length) {
					checkStr = s1.substring(i, s1Length)
							+ s1.substring(0, s2Length - (s1Length - i));
				} else {
					checkStr = s1.substring(i, i + s2Length);
				}
				if (checkStr.matches(s2)) {
					ans = true;
				}
			}
		}
		if (ans) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}
