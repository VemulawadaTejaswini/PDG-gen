public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String re = "APPROVED";
		int chk = 0;
		for (int i = 0; i < n; i++) {
			chk = sc.nextInt();
			if (chk % 2 == 0) {
				if (chk % 3 == 0 || chk % 5 == 0) {
				} else {
					re = "DENIED";
				}
			}
		}
		System.out.println(re);
	}
}
