public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String S = sc.next();
		String result = "No";
		if (N % 2 == 0) {
			String front = S.substring(0, N / 2);
			String rear = S.substring(N / 2, N);
			if (front.equals(rear)) {
				result = "Yes";
			}
		}
		System.out.println(result);
		sc.close();
	}
}
