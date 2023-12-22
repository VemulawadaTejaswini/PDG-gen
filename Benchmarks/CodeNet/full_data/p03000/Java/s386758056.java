
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int X = scan.nextInt();
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < N; i++) {
			list.add(scan.nextInt());
		}
		int d = 0;
		int bound = 1;
		for (int i = 0;; i++) {
			d += list.get(i);
			if (d > X) {
				break;
			} else {
				bound++;
			}
		}
		System.out.println(bound);

	}

}
