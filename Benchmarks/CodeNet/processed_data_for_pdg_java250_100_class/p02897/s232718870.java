public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int even = n / 2;
		if (n % 2 != 0) {
			even++;
		}
		double ans = (double) even / n;
		System.out.println(ans);
	}
}
