import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String l1 = scan.nextLine();
		scan.close();

		int N = Integer.valueOf(l1.split(" ")[0]);
		int M = Integer.valueOf(l1.split(" ")[1]);

		ArrayList<Integer> NMList = new ArrayList<Integer>();

		for (int i = 0; i < N; i++) {
			NMList.add(2);
		}

		for (int i = 0; i < M; i++) {
			NMList.add(1);
		}

		int result = 0;

		for (int i = 0; i < NMList.size(); i++) {
			for (int j = i + 1; j < NMList.size(); j++) {
				int a = NMList.get(i);
				int b = NMList.get(j);

				if (((a + b) % 2) == 0) {
					result++;
				}
			}
		}

		System.out.println(result);
	}
}