import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < N; i++) {
			list.add(scan.nextInt());
		}
		int min = 100000;
		for (int i = 0; i < N; i++) {
			int ant = 0;
			int post = 0;
			for (int j = 0; j <= i; j++) {
				ant += list.get(j);
			}
			for (int j = i + 1; j < N; j++) {
				post += list.get(j);
			}
			if (min > Math.abs(ant - post)) {
				min = Math.abs(ant - post);
			}
		}
		System.out.println(min);
	}

}
