import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int d = Integer.toString(N).length();
		final int[] elm_753 = { 3, 5, 7 };

		ArrayList<Integer> list753 = new ArrayList<>();
		list753.add(3);
		list753.add(5);
		list753.add(7);
		int time = 10;
		for (int i = 1; i < d; i++) {
			ArrayList<Integer> list = new ArrayList<>();
			int tmpTime = time;
			list753.forEach(l -> {
				for (int e : elm_753) {
					list.add(l + e * tmpTime);
				}
			});
			list753.addAll(list);
			time *= 10;
		}
		long count = 0;
		count = list753.stream().filter(l -> (l <= N && is753Number(l))).count();
		System.out.println(count);

		sc.close();
	}

	private static boolean is753Number(int x) {
		boolean three = false;
		boolean five = false;
		boolean seven = false;
		while (x > 0) {
			int mod = x % 10;
			switch (mod) {
			case 3:
				three = true;
				break;
			case 5:
				five = true;
				break;
			case 7:
				seven = true;
				break;
			default:
				return false;
			}
			x /= 10;
		}
		return three && five && seven;
	}
}
