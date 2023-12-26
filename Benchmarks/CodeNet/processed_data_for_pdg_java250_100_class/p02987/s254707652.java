public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		char[] c = new char[4];
		for (int i = 0; i < 4; i++) {
			c[i] = str.charAt(i);
		}
		int[] x = { 0, 0, 0, 0 };
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				if (i != j) {
					if (c[i] == c[j]) {
						x[i]++;
					}
				}
			}
		}
		boolean chk = true;
		for (int i = 0; i < 4; i++) {
			if (x[i] != 1) {
				chk = false;
			}
		}
		if (chk) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}
