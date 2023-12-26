public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int K = scanner.nextInt();
		int cnt = 1;
		while(N>=K){
			N = N/K;
			cnt++;
		}
		System.out.println(cnt);
	}
}
