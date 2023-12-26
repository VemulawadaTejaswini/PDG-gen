public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int K = sc.nextInt();
		String S = sc.next();
		if(S.length() <= K) {
			System.out.print(S);
		}
		else {
			System.out.print(S.substring(0,K) + "...");
		}
	}
}
