import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		ArrayList<Integer> as = new ArrayList<>();
		for (int i=0; i<n; i++) {
			as.add(scanner.nextInt());
		}
		Collections.sort(as);

		int max = as.get(n-1);
		float half = max/2.0f;
		int cand = -1;
		float candabs = max;
		for (int a:as) {
			float abs = Math.abs(a-half);
			if (abs<candabs) {
				cand = a;
				candabs = abs;
			}
		}
		System.out.println(max + " " + cand);
	}

}