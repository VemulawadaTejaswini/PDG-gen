public class Main {
	public static void main(String[] args) {
		int i = 1, n = 0;
		try (Scanner sc = new Scanner(System.in)) {
			while (true) {
				n = sc.nextInt();
				if(n == 0) {
					break;
				}
				System.out.println("Case " + i + ": " + n);
				i++;
			}
		}
	}
}
