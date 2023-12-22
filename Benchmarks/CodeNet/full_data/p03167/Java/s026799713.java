
import java.util.Scanner;


public class Main {

	/**
	 * @param args
	 */
	public static int MOD = 1_000_000_007;
	
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int h= sc.nextInt();
		int w = sc.nextInt();
		long[][] ans = new long[h][w];
		ans[0][0]=1;
		for (int i=0;i<h;i++) {
			String str = sc.next();
			for (int j=0;j<w;j++) {
				if (str.charAt(j)=='.') {
					if (i>0) {
						ans[i][j]+=ans[i-1][j];
					}
					if (j>0) {
						ans[i][j]+=ans[i][j-1];
					}
					ans[i][j]%=MOD;
				}
			}
		}
		System.out.println(ans[h-1][w-1]);
	}

}
