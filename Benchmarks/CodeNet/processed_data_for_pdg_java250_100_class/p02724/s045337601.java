public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		System.out.println(x/500 * 1000 + (x - x / 500 * 500) / 5 * 5);
	}
}
