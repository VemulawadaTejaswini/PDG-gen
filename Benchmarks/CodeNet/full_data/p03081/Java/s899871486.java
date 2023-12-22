import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int Q = sc.nextInt();
		sc.nextLine();
		String S = sc.nextLine();
		ArrayList<AbstractMap.SimpleEntry<Character, Boolean>> list = new ArrayList<AbstractMap.SimpleEntry<Character, Boolean>>();
		for (int i = 0; i < Q; i++) {
			list.add(new AbstractMap.SimpleEntry<Character, Boolean>(sc.next().charAt(0), sc.next().equals("R")));
		}
		HashMap<Character, ArrayList<Integer>> nex = new HashMap<Character, ArrayList<Integer>>();
		for (char i = 'A'; i <= 'Z'; i++) {
			nex.put(i, new ArrayList<Integer>());
		}
		for (int i = 0; i < N; i++) {
			nex.get(S.charAt(i)).add(i);
		}
		// System.out.println(S);
		int[] golems = new int[N];
		ArrayList<Integer> movs = new ArrayList<Integer>();
		int dels = 0;
		for (AbstractMap.SimpleEntry<Character, Boolean> wiz : list) {
			for (int i : nex.get(wiz.getKey())) {
				for(int k = 0;k<=golems[i];k++) {
				if (wiz.getValue()) {
					movs.add(i + 1);
				} else {
					movs.add(i - 1);
				}
			}
				golems[i] = -1;
			}

			for (int i : movs) {
				if (i < 0 || N <= i) {
					dels++;
				} else {
					golems[i]++;
				}
			}
//			 System.out.println(Arrays.toString(golems));
			movs.clear();
		}
		System.out.println(N - dels);
	}

}
