import java.util.Scanner;


public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String t = sc.next();
		int q = sc.nextInt();
		
		int[] sMod = new int[s.length()+1];
		sMod[0] = 0;
		for (int i=1;i<=s.length();i++) {
			sMod[i] = (sMod[i-1] + (s.charAt(i-1)=='A' ? 1 : 2))%3;
		}
		int[] tMod = new int[t.length()+1];
		tMod[0] = 0;
		for (int i=1;i<=t.length();i++) {
			tMod[i] = (tMod[i-1] + (t.charAt(i-1)=='A' ? 1 : 2))%3;
		}
		
		for (int i=0;i<q;i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			int d = sc.nextInt();

			int x = (sMod[b] - sMod[a-1] + 3) % 3;
			int y = (tMod[d] - tMod[c-1] + 3) % 3;
			
			System.out.println(x==y ? "YES" : "NO");
		}
	}

}
