import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		int[] w = new int[2];
		int[] h = new int[2];
		w[0] = 0;
		h[0] = 0;
		Scanner sc = new Scanner(System.in);
		w[1] = sc.nextInt();
		h[1] = sc.nextInt();
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			int a = sc.nextInt();
			switch (a) {
			case 1:
				w[0] = x;
				break;
			case 2:
				w[1] = x;
				break;
			case 3:
				h[0] = y;
				break;
			case 4:
				h[1] = y;
				break;

			default:
				break;
			}
		}
		sc.close();

		if (w[1] > w[0] && h[1] > h[0])
			System.out.println((w[1] - w[0]) * (h[1] - h[0]));
		else
			System.out.println(0);
	}
}