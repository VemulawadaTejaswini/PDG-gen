public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		int k = scan.nextInt();
		int max = 0;
		if (k <= a) {
			max = k;
		} else if (k <= (a + b)) {
			max = a;
		} else {
			k = k - a;
			k = k - b;
			max = a - k;
		}
			System.out.print(max);
	}
}
