
public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		long a = s.nextLong();
		long b = s.nextLong();
		long x = s.nextLong();
		long answer = 0;

		if ((b - a) < x) {
			if (a == b) {
				if (a % x != 0) {
					answer = 0;
				} else if (a % x == 0) {
					answer = 1;
				}
			} else if (b % 2 == 0) {
				answer = 1;

			} else if (b % 2 != 0) {
				answer = 1;

			}

		} else if ((b - a) > x) {
			if (a == b) {
				if (a % x != 0) {
					answer = 0;
				} else if (a % x == 0) {
					answer = 1;
				}
			} else if (a == 0) {
				answer = (b / x) + 1;
			} else {
				if ((b - a) % 2 == 0) {
					if ((b - a) % x == 0) {
						answer = (b - a) / x + 1;
					} else if ((b - a) % x != 0) {

						answer = (b - a) / x;
					}
				} else if ((b - a) % 2 != 0) {
					if ((b - a) % x == 0) {
						answer = (b - a) / x;
					} else if ((b - a) % x != 0) {

						answer = (b - a) / x + 1;
					}
				}
			}
		}
		System.out.println(answer);
	}

}