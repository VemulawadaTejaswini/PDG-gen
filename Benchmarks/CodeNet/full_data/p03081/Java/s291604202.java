import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int Q = sc.nextInt();
		sc.nextLine();
		String s = sc.nextLine();

		Map<Character, List<Integer>> charindex = new HashMap<Character, List<Integer>>();
		int[] box = new int[N];
		int deletednum = 0;

		for (int i = 0; i < N; i++) {
			box[i] = 1;

			List<Integer> index;
			if ((index = charindex.get(s.charAt(i))) == null) {
				index = new ArrayList<Integer>();
			}
			index.add(i);
			charindex.put(s.charAt(i), index);
		}

		for (int i = 0; i < Q; i++) {
			String[] td = sc.nextLine().split(" ");
			String t = td[0];
			String d = td[1];

			List<Integer> index;
			if ((index = charindex.get(t.charAt(0))) != null) {
				for (int j = 0; j < index.size(); j++) {
					int boxnum = index.get(j);

					if ((boxnum == 0 && d.equals("L")) || (boxnum == N - 1 && d.equals("R"))) {
						deletednum += box[boxnum];
						box[boxnum] = 0;
					} else if (d.equals("L")) {
						box[boxnum - 1] += box[boxnum];
						box[boxnum] = 0;
					} else {
						box[boxnum + 1] += box[boxnum];
						box[boxnum] = 0;
					}
				}
			}
		}

		System.out.println(N - deletednum);
	}

}
