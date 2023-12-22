public class Main {
	public static void main(String[] args) {
		java.util.Scanner s = new java.util.Scanner(System.in);

		System.out.println((Main.calc(s.nextInt(), s.nextInt())));
	}

	public static int calc(int k, int s) {
		int count = 0;
		for (int x = 0; x <= k; x++) {
			for (int y = 0; y <= k; y++) {
				for (int z = 0; z <= k; z++) {
					if (x + y + z == s) {
						count++;
					}
				}
			}

		}
		return count;
	}
}