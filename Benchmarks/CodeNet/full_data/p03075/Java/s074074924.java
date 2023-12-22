
public class Main {
	public static void main(String args[]) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		int[] a = new int[5];

		for (int i = 0; i < 5; i++) {
			a[i] = sc.nextInt();
		}

		int k = sc.nextInt();

		boolean f = false;
		for (int i = 0; i < a.length; i++) {
			for (int j = i; j < a.length; j++) {
				if (Math.abs(a[i] - a[j]) > k) {
					f = true;
				}
			}
		}

		if (f) {
			System.out.println(":(");
		} else {
			System.out.println("Yay!");
		}
	}
}
