import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int q = scn.nextInt();
		String s = scn.next();
		int[][] lr = new int[2][q];
		int[] ans = new int[q];
		for(int i = 0;i < q;i++) {
			lr[0][i]=scn.nextInt() - 1;
			lr[1][i]=scn.nextInt();
		}
		for(int i = 0;i < q;i++) {
			StringBuilder txt = new StringBuilder(s.substring(lr[0][i], lr[1][i]));
			while(txt.indexOf("AC")!=-1) {
				txt.delete(0, txt.indexOf("AC")+1);
				ans[i]++;
			}
		}
		for(int a:ans) {
			System.out.println(a);
		}
		scn.close();
	}
}
