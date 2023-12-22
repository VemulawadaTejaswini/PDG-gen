




import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeSet;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int q = sc.nextInt();
		String s = sc.next();

		HashMap<Integer, TreeSet<Integer>> spells = new HashMap<>();
		for (int i=0;i<52;i++) {
			spells.put(i, new TreeSet<Integer>());
		}

		for (int i=0;i<q;i++) {
			String t = sc.next();
			String d = sc.next();
			if (d.charAt(0)=='L') {
				spells.get(((t.charAt(0)-'A')*2)).add(i);
			} else {
				spells.get(((t.charAt(0)-'A')*2+1)).add(i);
			}
		}

		int right = 0;
		int pos = q;
		while (true) {

			 if (spells.get((s.charAt(right)-'A')*2).lower(pos) == null) {
				 break;
			 } else {
				 pos=spells.get((s.charAt(right)-'A')*2).lower(pos);
				 right++;
			 }
			 if (right > n-1) {
				 break;
			 }
		}

		int left= n-1;
		 pos = q;
		while (true) {

			 if (spells.get((s.charAt(left)-'A')*2+1).lower(pos) == null) {
				 break;
			 } else {
				 pos=spells.get((s.charAt(left)-'A')*2+1).lower(pos);
				 left--;
			 }

			 if (left<0) {
				 break;
			 }
		}

		System.out.println(left-right+1);

	}


}
