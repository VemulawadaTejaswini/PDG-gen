class Main {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		String s = stdIn.next();
		char[] a = new char[10];
		for (int j = 0; j < 10; j++) {
			a[j] = s.charAt(j);
		}
		int c = Character.getNumericValue(a[6]);
		String t = "TBD";
		if (a[5] == '0') {
			if (c < 5)
				t = "Heisei";
		}
		System.out.println(t);
	}
}
