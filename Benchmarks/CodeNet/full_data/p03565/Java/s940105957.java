import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s, t, ans;
		s = sc.next();
		t = sc.next();
		sc.close();
		int n = t.length();
		int n2 = s.length();
		int bm[] = new int[27];
		for (int i = 0; i < 27; ++i) {
			bm[i] = n;
		}

		for (int i = 0; i < n; ++i) {
			int tmp = (int) (t.charAt(i) - 'a');
			bm[tmp] = n - i - 1;
		}

		ans = "zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz";
		int i = n - 1, j = i;
		int count = 0;
		//System.out.println(n2);
		while (i < n2) {
			while (i < n2 && j >= 0) {
				if (s.charAt(i) != t.charAt(j) && s.charAt(i) != '?') {
					int tmp = (int) (s.charAt(i) - 'a');
					if (bm[tmp] <= n - j) {
						i += n - j;
						j = n - 1;
					} else {
						i += bm[tmp];
						j = n - 1;
					}
				} else {
					i--;
					j--;
				}
			}
			if (j < 0) {
				StringBuffer tmp = new StringBuffer();
				//System.out.println(tmp + ">>" + i);
				for (int k = 0; k < i + 1; ++k)
					tmp.append(s.charAt(k));
				for (int k = 0; k < n; ++k)
					tmp.append(t.charAt(k));
				for (int k = n + i + 1; k < n2; ++k)
					tmp.append(s.charAt(k));
				String tmp2 = tmp.toString();
				tmp2 = tmp2.replace('?', 'a');
				//System.out.println(tmp2);
				if (ans.compareTo(tmp2) > 0)
					ans = tmp2;
				j = n - 1;
				i += n + 1;
				//System.out.println(i);
				++count;
			}
			else {
				++j;
				++i;
			}
		}
		if (count <= 0)
			System.out.println("UNRESTORABLE");

		else
			System.out.println(ans);
	}

}
