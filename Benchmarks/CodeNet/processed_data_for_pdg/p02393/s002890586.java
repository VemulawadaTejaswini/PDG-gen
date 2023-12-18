public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] n = new int[3];
		for (int i = 0; i < 3; i++) {
			n[i] = sc.nextInt();
		}
		Arrays.sort(n);
		for (int i = 0; i < 3; i++) {
			System.out.print(n[i]);
			if (i != 2) {
				System.out.print(" ");
			} else {
				System.out.println();
			}
		}
		sc.close();
	}
}
