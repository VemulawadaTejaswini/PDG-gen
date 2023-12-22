import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int min = sc.nextInt();
		int max = sc.nextInt();
		int result = 0;
		for (int i = min; i <= max; i++) {
			String[] values = String.valueOf(i).split("");
			if (values[0].equals(values[4]) && values[1].equals(values[3])) {
				result++;
			}
		}
		System.out.println(result);
	}
}