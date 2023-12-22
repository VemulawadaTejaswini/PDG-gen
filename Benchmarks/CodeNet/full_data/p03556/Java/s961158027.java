import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.close();
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 1; i < 40000; i++) {
			list.add(i * i);
		}
		if (list.contains(N)) {
			System.out.println(N);
		} else {
			for (int i = 0; i < list.size(); i++) {
				if (list.get(i) > N) {
					System.out.println(list.get(i - 1));
					break;
				}
			}
		}
	}
}