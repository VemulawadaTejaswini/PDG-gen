public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] num = new int[3];
		for (int i = 0; i < num.length; i++) {
			num[i] = scanner.nextInt();
		}
		for (int i = 0; i < num.length - 1; i++) {
			for (int j = 1; j < num.length; j++) {
				if (num[i] > num[j]) {
					int buf = num[i];
					num[i] = num[j];
					num[j] = buf;
				}
			}
		}
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i]);
			if (i < num.length - 1)
				System.out.print(" ");
			else
				System.out.print("\n");
		}
	}
}
