public class Main {
	public static void main(String[] args) {
		Scanner sc1 = new Scanner(System.in);
		int i = 0;
		while (true) {
			int tmp = sc1.nextInt();
			i++;
			if (tmp > 0) {
				System.out.println("Case " + i + ": " + tmp);
			}
			else break;
		}
		sc1.close();
	}
}
