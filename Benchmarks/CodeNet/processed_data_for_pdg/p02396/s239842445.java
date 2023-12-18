public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x;
		int countDeta;
		int[] deta = new int[10000];
		for (countDeta = 0; countDeta < 10000; countDeta++) {
			x = sc.nextInt();
			if (x == 0) {
				break;
			}
			deta[countDeta] = x;
		}
		for (int i = 0; i < countDeta; i++) {
			System.out.println("Case" + " " + (i + 1) + ": " + deta[i]);
		}
		sc.close();
	}
}
