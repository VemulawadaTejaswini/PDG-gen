import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		while (in.hasNext()) {
			int N = in.nextInt();
			ArrayList<Integer> lmds = new ArrayList<Integer>();
			
			for (int i = 0; i < N; ++i) {
				int a = in.nextInt();
				
				int idx = Collections.binarySearch(lmds, a, Collections.reverseOrder());
				idx = Math.max(idx, -(idx + 1));
				
				if (idx >= lmds.size()) {
					lmds.add(a);
				} else {
					if (lmds.get(idx) == a) {
						lmds.add(idx, a);
					} else {
						lmds.set(idx, a);
					}
				}
				
			}

			System.out.println(lmds.size());
		}
	}

}
