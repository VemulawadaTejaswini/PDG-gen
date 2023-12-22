import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int W = sc.nextInt();
		char[][] c = new char[H][W];
		int[][][] ans=new int[H][W][2];
		for (int i=0;i<H;i++) {
			String S=sc.next();
			for (int j=0;j<W;j++) {
				c[i][j]=S.charAt(j);
			}
		}
		for (int i=0;i<H;i++) {
			int left=0;
			int right=0;
			Queue<int[]> queue = new ArrayDeque<int[]>();
			for (int j=0;j<W;j++) {
				if (c[i][j]=='#') {
					ans[i][j][0]=-5000000;
					int[] tmp = {i,left,right};
					queue.add(tmp);
					right++;
					left=right;
				} else {
					if (j==W-1) {
						right++;
						int[] tmp = {i,left,right};
						queue.add(tmp);
					} else {
						right++;
					}
				}
				while (!queue.isEmpty()) {
					int[] rem=queue.remove();
					int I = rem[0];
					int Left = rem[1];
					int Right = rem[2];
					for (int k=Left;k<Right;k++) {
						ans[I][k][0]=Right-Left;
					}
				}
			}
		}
		for (int j=0;j<W;j++) {
			int left=0;
			int right=0;
			Queue<int[]> queue = new ArrayDeque<int[]>();
			for (int i=0;i<H;i++) {
				if (c[i][j]=='#') {
					ans[i][j][1]=-5000000;
					int[] tmp = {j,left,right};
					queue.add(tmp);
					right++;
					left=right;
				} else {
					if (i==H-1) {
						right++;
						int[] tmp = {j,left,right};
						queue.add(tmp);
					} else {
						right++;
					}
				}
				while (!queue.isEmpty()) {
					int[] rem=queue.remove();
					int J = rem[0];
					int Left = rem[1];
					int Right = rem[2];
					for (int k=Left;k<Right;k++) {
						ans[k][J][1]=Right-Left;
					}
				}
			}
		}

		int[][] ans_2 = new int[H][W];
		int Ans=0;
		for (int i=0;i<H;i++) {
			for (int j=0;j<W;j++) {
				ans_2[i][j]=ans[i][j][0]+ans[i][j][1];
				Ans=Math.max(Ans,ans_2[i][j]);
			}
		}
		System.out.println(Ans-1);
	}
}