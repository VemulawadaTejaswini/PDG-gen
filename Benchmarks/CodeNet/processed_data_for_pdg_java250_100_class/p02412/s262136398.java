public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		while (true) {
			int count = 0;
			int n = sc.nextInt();
			int x = sc.nextInt();
			if (n == 0 && x == 0) {
				break;
			} else {
				for (int i = 1; i <= n; i++) {
					for (int j = i + 1; j <= n; j++) {
						for (int j2 = j + 1; j2 <= n; j2++) {
							if (i + j + j2 == x) {
								count++;
							}
						}
					}
				}
				System.out.println(count);
			}
		}
		sc.close();
	}
}
