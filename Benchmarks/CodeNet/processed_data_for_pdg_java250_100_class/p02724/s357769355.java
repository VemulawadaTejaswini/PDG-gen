public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int Coin = sc.nextInt();
		int coin500 = Coin / 500;
		int coin5 = (Coin % 500) / 5;
		int Coinsum = coin500 * 1000 + coin5 * 5;
		System.out.println(Coinsum);
		sc.close();
	}
}
