import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		sc.close();

		ArrayList<Long> list = new ArrayList<>();

		list.add((long) 2);
		list.add((long) 1);

		for(int i = 2; i <= N; i++) {
			list.add(list.get(i - 1) + list.get(i - 2));
		}
		System.out.println(list.get(N));
	}

}