import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H = Integer.parseInt(sc.next());
		int W = Integer.parseInt(sc.next());

		int[][] A = new int[H+2][W+2];
		boolean[][] isB = new boolean[H+2][W+2];

		for(int i=1;i<H+1;i++) {
			String t = sc.next();

			for(int j=1;j<W+1;j++) {

				String subt = t.substring(j-1,j);

				if(subt.equals("#")) {
					A[i][j]=2;
				}else{
					A[i][j]=1;
				}
			}
		}

		int cnt=0;
		for(;;) {
			for(int i=1;i<H+1;i++) {
				for(int j=1;j<W+1;j++) {

					if(A[i][j]==1&&A[i+1][j]==2||A[i-1][j]==2||
						A[i][j+1]==2||A[i][j-1]==2){
						isB[i][j]=true;
					}
				}
			}
			for(int i=1;i<H+1;i++) {
				for(int j=1;j<W+1;j++) {
					if(isB[i][j]) {
						A[i][j]=2;
					}
				}
			}
			int c=0;
			for(int i=1;i<H+1;i++) {
				for(int j=1;j<W+1;j++) {
					if(A[i][j]==1) {
						break;
					}else {
						c++;
					}
				}
			}
			cnt++;
			if(c==H*W) {
				break;
			}
		}

		System.out.println(cnt);
		sc.close();
	}
}