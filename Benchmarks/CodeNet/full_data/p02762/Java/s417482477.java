import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int k = sc.nextInt();

		ArrayList<HashSet> setList = new ArrayList<HashSet>();
		int[] counts = new int[n];
		for (int i = 0; i < m; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int index1 = getSetIndex(setList, a);
			int index2 = getSetIndex(setList, b);
			if (index1 == -1 && index2 == -1) {
				HashSet set = new HashSet();
				set.add(a);
				set.add(b);
				setList.add(set);
			} else if (index1 == -1) {
				setList.get(index2).add(a);
			} else if (index2 == -1) {
				setList.get(index1).add(b);
			} else if (index1 != index2) {
				for (Object x : setList.get(index2)) {
					setList.get(index1).add(x);
				}
				setList.remove(index2);
			}
			counts[a - 1]++;
			counts[b - 1]++;
		}

		for (int i = 0; i < k; i++) {
			int c = sc.nextInt();
			int d = sc.nextInt();
			int index1 = getSetIndex(setList, c);
			int index2 = getSetIndex(setList, d);
			if (setList.get(index1).contains(d)) {
				counts[c - 1]++;
			}
			if (setList.get(index2).contains(c)) {
				counts[d - 1]++;
			}
		}
		sc.close();

		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < n; i++) {
			int index = getSetIndex(setList, i + 1);
			int result = index == -1 ? 0 : setList.get(index).size() - 1 - counts[i];
			sb.append(i == 0 ? "" : " ");
			sb.append(result);
		}
		System.out.print(sb.toString());
	}

	private static int getSetIndex(ArrayList<HashSet> setList, int n) {
		for (int i = 0; i < setList.size(); i++) {
			if (setList.get(i).contains(n)) {
				return i;
			}
		}

		return -1;
	}
}
