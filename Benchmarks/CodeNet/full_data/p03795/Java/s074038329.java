public class Restaurant {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		int y = 200 * (N / 15);
		int x = 800 * N ;
		int receivedPrice = x - y;
		
		System.out.println(receivedPrice);

	}
}
