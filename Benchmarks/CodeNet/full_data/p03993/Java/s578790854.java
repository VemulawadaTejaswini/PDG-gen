import java.util.ArrayList;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Integer N = sc.nextInt();
		ArrayList<Integer> data = new ArrayList<>();
		data.add(0);
		for (int i = 0; i < N; i++) {
			data.add(sc.nextInt());
		}
		int counter = 0;
		for (int i = 1; i <= N; i++) {
			// current = i
			int pair = data.get(i);
			if (data.get(pair) == i) {
				counter++;
			}
		}
		System.out.println(counter / 2);
	}

}
