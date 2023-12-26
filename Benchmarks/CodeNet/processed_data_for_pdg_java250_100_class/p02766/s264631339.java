public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N;
		int K;
		N = scan.nextInt();
		K = scan.nextInt();
		int ans  = 0;
		while(N  > 0) {
			N = N / K;
			ans++;
		}
		System.out.println(ans);
	}
}
