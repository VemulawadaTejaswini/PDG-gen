import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.nextLine();
		String S = sc.next();
		List<String> wbS = new ArrayList<String>();

		String wb = S.substring(0, 1);
		String key = "";
		for (int i = 0; i < S.length(); i++) {
			String nextW = (wb.equals("#") ? "." : "#");
			int idx = S.substring(i).indexOf(nextW);
			if (idx == -1) {
				idx = S.length()-i;
			}
			wbS.add(repeat(wb, idx));
			i += idx-1;
			key += wb;
			wb = nextW;
		}

		List<String> alignment = search(Arrays.asList(key));
//		System.out.println(alignment);
		//System.out.println(wbS);

		int answer = -1;
		for (String leaf : alignment) {
			int count = 0;
			for (int i = 0; i < key.length(); i ++) {
				if (!key.substring(i, i+1).equals(leaf.substring(i, i+1))) {
					count += wbS.get(i).length();
				}
			}
			if (answer == -1 || answer > count) {
				answer = count;
			}
		}

		System.out.println(answer);

	}

	public static String repeat(String str, int n) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < n; i++) {
			sb.append(str);
		}
		return sb.toString();
	}

	public static List<String> search(List<String> treeLeaf) {
		Set<String> list = new HashSet<String>();
		boolean searched = true;
		for (String leaf : treeLeaf) {
			int idx = leaf.indexOf("#.");
			if (idx == -1) {
				list.add(leaf);
				continue;
			} else {
				searched = false;
				list.add(leaf.replaceFirst("#", "."));
				String str = leaf.substring(0, idx + 1) + "#" + leaf.substring(idx + 2);
				if (!str.contains("#.") || str.indexOf("#.") > idx) {
					list.add(str);
				}
			}
		}

		//System.out.println(list);

		if (searched) {
			return new ArrayList<String>(list);
		} else {
			return search(new ArrayList<String>(list));
		}
	}
}
