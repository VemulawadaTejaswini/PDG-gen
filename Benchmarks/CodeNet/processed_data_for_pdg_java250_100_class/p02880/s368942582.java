public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = 0;
		String answer = "No";
		num = scan.nextInt();
		for (int i = 1; i <= 9; i++) {
			if (num > i * 9) {
				continue;
			}
			if (num % i == 0) {
				answer = "Yes";
				break;
			}
		}
		System.out.println(answer);
	}
}
