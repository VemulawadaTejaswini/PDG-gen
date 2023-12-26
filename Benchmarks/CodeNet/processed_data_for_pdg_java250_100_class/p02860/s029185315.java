public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String S = sc.next();
		sc.close();
		String answer = "No";
		if(N % 2 == 0) {
			String f = S.substring(0, N/2);
			String r = S.substring(N/2);
			if(f.equals(r)) {
				answer = "Yes";
			}
		}
		System.out.println(answer);
	}
}
