import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try(Scanner sn = new Scanner(System.in)) {
			String s = sn.next();
			int k = sn.nextInt();

			String[] ss = s.split("");
			ArrayList<String> al = new ArrayList();
			StringBuilder sb1 = null;
			String tmp1 = null;
			StringBuilder sb2 = null;
			String tmp2 = null;
			for (int i = 0; i < ss.length; i++) {
				if (!al.contains(ss[i])) {
					al.add(ss[i]);
				}

				sb1 = new StringBuilder();
				for (int j = 0; j <= i; j++) {
					sb1.append(ss[j]);
				}
				tmp1 = sb1.toString();
				if (sb1.length() != 0 && !al.contains(tmp1)) {
					al.add(tmp1);
				}

				sb2 = new StringBuilder();
				for (int j = i; j < ss.length; j++) {
					sb2.append(ss[j]);
				}
				tmp2 = sb2.toString();
				if (sb2.length() != 0 && !al.contains(tmp2)) {
					al.add(tmp2);
				}
			}
			String[] result = al.toArray(new String[0]);
			Arrays.sort(result, new Comp());
			System.out.println(result[result.length - k]);
		}
	}
}

class Comp implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		String s1 = (String)o1;
		String s2 = (String)o2;
		if (s1.length() < s2.length()) {
			return -1;
		} else if (s1.length() > s2.length()) {
			return 1;
		} else {
			return s1.compareTo(s2);
		}
	}

}
