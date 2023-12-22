import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n, a, b, c, d;

		n = s.nextInt();
		a = s.nextInt();
		b = s.nextInt();
		c = s.nextInt();
		d = s.nextInt();
		String sk = s.next();
		String si[] = new String[n];

		int i, j;
		String ans = "No";

		si = sk.split("");
	
		for (i = b; i < si.length; i++) {
			if (si[i].equals(".")&&si[i].equals(".")&&si[i].equals(".")) {
				si[i] = si[i].replace(".", "#");
				for (j = 1; j < si.length - 1; j++) {
					if (si[j].equals("#") && si[j + 1].equals("#"))
						ans = "No";
//					if ((si[j - 1].equals(".") && si[j].equals("#") && si[j + 1].equals(".")) ||
//							(si[j - 1].equals("#") && si[j].equals(".") && si[j + 1].equals("#")))
//						ans = "Yes";
				}
				si[i] = si[i].replace("#", ".");
			}
		}
		System.out.println(ans);
	}
}
