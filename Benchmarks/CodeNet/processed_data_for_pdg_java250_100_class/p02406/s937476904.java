public class Main {
	public static void main(String[] args) {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String x = "";
		try {
			x = in.readLine();
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		int n = Integer.parseInt(x);
		for (int i = 0; i < n; i++) {
			int num = i + 1;
			if (((num % 3) == 0) || ((num % 10) == 3)) {
				System.out.print(" " + (i + 1));
			} else {
				while (num != 0) {
					num = num / 10;
					if ((num % 10) == 3) {
						System.out.print(" " + (i + 1));
						break;
					}
				}
			}
		}
		System.out.println();
	}
}
