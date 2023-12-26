public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		int cnt = 1;
		while (cnt <= input) {
			if (cnt % 10 == 3 || cnt % 3 == 0) {
				System.out.print(" " + cnt);
			} else {
				String s_cnt = Integer.toString(cnt);
				if (s_cnt.contains("3")) {
					System.out.print(" " + cnt);
				} else {
				}
			}
			cnt++;
		}
		System.out.println();
		sc.close();
	}
}
