public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = 1;
		int x = 0;
		int n = 0;
		n = sc.nextInt();
		sc.close();
		while (i <= n) {
			x = i;
			if (x % 3 == 0) {
				System.out.printf(" %d", i);
				i++;
				continue;
			}
			while (x != 0) {
				if (x % 10 == 3) {
					System.out.printf(" %d", i);
					break;
				}
				x /= 10;
			}
			i++;
		}
		System.out.printf("\n");
	}
}
