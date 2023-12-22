import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int max = sc.nextInt();
		int rest = sc.nextInt();
		int result = 0;
		for (int a = 1; a <= max; a++) {
			if (rest == a) {
				result += max - a;
				continue;
			}
			for (int b = 1; b<=a; b++) {
				if (a % b >= rest) {
					result++;
				}
			}
		}
		System.out.println(result);
	}
}