public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		boolean isStepable = true;
		String ans = "";
		for (int i = 0; i < S.length(); i++) {
			if (i % 2 == 0) {
				if (S.charAt(i) == 'L') {
					isStepable = false;
				}
			} else {
				if (S.charAt(i) == 'R') {
					isStepable = false;
				}
			}
		}
			if (isStepable) {
				ans = "Yes";
			} else {
				ans = "No";
			}
			System.out.println(ans);
	}
}
