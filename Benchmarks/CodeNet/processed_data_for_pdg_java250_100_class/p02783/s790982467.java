public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int attacked = 0;
		for (int i = 1; a > 0; i++) {
			a = a - b;
			attacked = i;
		}
		System.out.println(attacked);
	}
}
