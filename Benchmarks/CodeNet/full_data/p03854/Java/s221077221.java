import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		String reversS = new StringBuffer(S).reverse().toString();
		String[] targetStr = { "dreamer", "dream", "eraser", "erase" };
		String[] reverseTargetStr = new String[targetStr.length];
		String tmp;
		boolean flg = true;
		
		System.gc();

		for (int i = 0; i < targetStr.length; i++) {
			reverseTargetStr[i] = new StringBuffer(targetStr[i]).reverse().toString();
		}


		while (flg) {
			tmp = reversS;
			for (String str : reverseTargetStr) {
				if (reversS.startsWith(str)) {
					reversS = reversS.substring(str.length());
				}
			}
			if (tmp.equals(reversS)) flg = false;
		}

		System.out.println(reversS.length() == 0 ? "YES" : "NO");
	}
}
