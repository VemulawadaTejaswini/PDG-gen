import java.util.*;

public class Main {

	public static String reverse(String t) {
		StringBuffer str = new StringBuffer(t);
		return str.reverse().toString().substring(0);
	}

	public static String cat(String t, String cat, int flag) {
		StringBuffer str = new StringBuffer();
		if (flag == 1) {
			str.append(cat);
			str.append(t);
		} else {
			str.append(t);
			str.append(cat);
		}
		return str.toString().substring(0);
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int q = sc.nextInt();
		boolean reversflag = false;
		for (int i = 0; i < q; ++i) {
			int t = sc.nextInt();
			if (t == 1)
				reversflag = !reversflag;
			else {
				int f = sc.nextInt();
				String c = sc.next();
				if (reversflag) {
					if (f == 1)
						f = 2;
					else
						f = 1;
				}
				s = cat(s, c, f);
			}
		}
		if (reversflag)
			s = reverse(s);
		System.out.println(s);
		sc.close();
	}
}
