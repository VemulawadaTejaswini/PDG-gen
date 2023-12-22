import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);
	static int s = Integer.parseInt(sc.next());
	static List<Integer> a = new ArrayList<>();
	public static void main(String[] args) {
		a.add(s);
		for (int i = 0; i <= 1000000 -2; i++) {
			int temp = calc(a.get(i));
			if (a.contains(temp)) {
				System.out.println(i+2);
				break;
			}
			a.add(temp);
		}
	}
	static int calc(int ai) {
		if (ai%2 == 0) {
			return ai/2;
		} else {
			return 3*ai + 1;
		}
	}
}