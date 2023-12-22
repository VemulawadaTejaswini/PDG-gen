import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		no3();
	}

	static void no3() {
		try (Scanner sc = new Scanner(System.in)) {
			int N = sc.nextInt();

			int min = 0;
			int max = N - 1;
			int mid;

			System.out.println(min);
			System.out.flush();

			String minStr = sc.nextLine();
			if (minStr.equals("Vacant")) {
				return;
			}

			String midStr;

			for (int i = 1; i < 20; i++) {
				mid = min + ((max - min) / 2);
				if ((max - min) % 2 != 0) {
					mid--;
					if (mid == min) {
						System.out.println(mid + 1);
						System.out.flush();

						midStr = sc.nextLine();
						if (midStr.equals("Vacant")) {
							return;
						}
						System.out.println(mid + 2);
						System.out.flush();
						return;
					}
				}

				System.out.println(mid);
				System.out.flush();

				midStr = sc.nextLine();
				if (midStr.equals("Vacant")) {
					return;
				}

				if (midStr.equals(minStr)) {
					min = mid;
				} else {
					max = mid;
				}
			}
		}
	}

}
