import java.util.*;

public class Main{
	public static void main(String[] $$) throws Exception {
		Scanner $ = new Scanner(System.in);
		String S = $.next();
		int w = 0;
		for (int i = 0; i < S.length(); i++){
			if (S.substring(i, i + 1).equals("o")) w++;
		}
		w += (15 - S.length());
		if (w > 7) System.out.println("YES");
		else System.out.println("NO");
		/*
		oxoxoxoxoxoxox -> YES
		xxxxxxxx -> NO
		*/
	}
}
