import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		List<Integer> Ai = new ArrayList<Integer>();
		for (int i=0; i<N; i++) {
			Ai.add(sc.nextInt());
		}
		Collections.sort(Ai);

		while (Ai.size() > 1) {
			int min = Ai.get(0);
			for (int i=Ai.size()-1; i>0; i--) {
				if (Ai.get(i) % min == 0) {
					Ai.remove(i);
				}
				else {
					Ai.set(i, Ai.get(i) % min);
				}

			}
			Collections.sort(Ai);
		}
		System.out.println(Ai.get(0));
	}

}
