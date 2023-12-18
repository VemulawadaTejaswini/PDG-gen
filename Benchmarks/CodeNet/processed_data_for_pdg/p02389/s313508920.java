public class Main {
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			int n = sc.nextInt();
			int m = sc.nextInt();
			System.out.println(String.format("%d %d", n * m, 2 * (n + m)));
		}
	}
}
