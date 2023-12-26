public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int a = sc.nextInt();
		int count = 0;
		if (h % a == 0) {
			count = h / a;
		} else {
			count = h / a + 1;
		}
		System.out.println(count);
		sc.close();
	}
}
