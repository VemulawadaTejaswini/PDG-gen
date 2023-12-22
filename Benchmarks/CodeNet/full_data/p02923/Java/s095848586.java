import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int max = 0;
		int tmp = 0;
		Scanner sc = new Scanner(System.in);
		String N = sc.nextLine();
		String H = sc.nextLine();
		String[] h = H.split(" ");
		ArrayList<Integer> H2 = new ArrayList<Integer>();
		for (int i = 0; i < h.length; i++) {
			H2.add(Integer.parseInt(h[i]));
		}

		for (int i = 0; i < H2.size(); i++) {
			tmp = 0;
			for (int j = i; j < H2.size() - 1; j++) {
				if (H2.get(j) >= H2.get(j + 1)) {
					tmp++;
				} else {
					break;
				}

				if (tmp > max) {
					max = tmp;
				}
			}
		}
		System.out.println(max);
		sc.close();
	}
}