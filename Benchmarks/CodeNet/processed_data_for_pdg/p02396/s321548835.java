public class Main {
	public static void main(String[] args) {
		int i = 1;
		Scanner sc = new Scanner(System.in);
		while (true) {
			int x = sc.nextInt();
			if (x == 0) {
				break;
			} else {
				System.out.println("Case " + i + ": " + x);
				i++;
			}
		}
		sc.close();
	}
}
