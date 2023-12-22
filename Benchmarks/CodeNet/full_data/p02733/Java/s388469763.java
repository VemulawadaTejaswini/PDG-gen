import java.util.*;

public class Main {
	static int H,W;
	static char[][] c;
	static int[][] num;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		H = sc.nextInt();
		W = sc.nextInt();
		int K = sc.nextInt();
		c = new char[H][];
		for(int i=0; i<H; i++)
			c[i] = sc.next().toCharArray();
		num = new int[H+1][W+1];
		for(int i=0; i<H; i++) {
			for(int j=0; j<W; j++) {
				num[i+1][j+1] = num[i+1][j] + num[i][j+1] - num[i][j] + (c[i][j]=='1' ? 1: 0);
			}
		}
		
		int ans = H*W;
		for(int i=0; i<1<<(H-1); i++) {
			ArrayList<Integer> cut = new ArrayList<>();
			cut.add(0);
			for(int j=0; (1<<j)<=i; j++) {
				if((i&(1<<j)) != 0)
					cut.add(j+1);
			}
			cut.add(H);
			int vercut = 0;
			int idx=0;
			for(int j=1; j<=W; j++) {
				boolean ok = true;
				for(int k=1; k<cut.size(); k++) {
					if(count(cut.get(k-1), idx, cut.get(k), j)>K) {
						ok = false;
						break;
					}
				}
				if(!ok) {
					if(j==idx+1)
						continue;
					vercut++;
					idx=j-1;
					j--;
				}
			}
			ans = Math.min(ans, cut.size()-2 + vercut);
		}
		
		System.out.println(ans);
		sc.close();
	}

	static int count(int y0, int x0, int y1, int x1) {
		return num[y1][x1] - num[y1][x0] - num[y0][x1] + num[y0][x0];
	}
}

