
import java.util.Scanner;


public class Main {



	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int h = sc.nextInt();
		int w = sc.nextInt();
		int k = sc.nextInt();
		int piece = 1;
		int lineCount = 1;
		String lastAns = "";
		for (int i=0;i<h;i++) {
			String s = sc.next();
			int[] out = new int[w];
			int rightMost = -1;
			for (int j=0;j<w;j++) {
				if (s.charAt(j)=='#') {
					rightMost=j;
				}
			}

			if (rightMost>=0) {
				for (int j=0;j<w;j++) {
					out[j]=piece;
					if (s.charAt(j)=='#' && j!=rightMost) {
						piece++;
					}
				}
				piece++;

				StringBuilder ans = new StringBuilder();
				for (int j=0;j<w;j++) {
					ans.append(out[j]);
					if (j<w-1) {
						ans.append(" ");
					}
				}
				for (int j=0;j<lineCount;j++) {
					System.out.println(ans);
				}
				lineCount=1;
				lastAns = ans.toString();
			} else {
				lineCount++;
			}
		}
		for (int i=0;i<lineCount-1;i++) {
			System.out.println(lastAns);
		}

	}

}