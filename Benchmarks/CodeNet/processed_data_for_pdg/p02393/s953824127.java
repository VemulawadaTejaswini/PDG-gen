public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		short[] a = new short[3];
		for (int i = 0; i < 3; i++) {
			a[i] = sc.nextShort();
		}
		for (int i = 0; i < 3; i++) {
			for (int j = i + 1; j < 3; j++) {
				if (a[i] > a[j]) {
					short b = a[i];
					a[i] = a[j];
					a[j] = b;
				}
			}
		}
		System.out.println(a[0] + " " + a[1] + " " + a[2]);
		sc.close();
	}
}
