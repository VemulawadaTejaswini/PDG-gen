import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		long ans=0;
		int H,W,lw,K,p;
		Scanner sc = new Scanner(System.in);
		H = sc.nextInt();
		W = sc.nextInt();
		lw = W-1;
		K = sc.nextInt();
		p = 0;
		int cell = (int)Math.pow(2, H*lw);

		for(int i = 0; i<cell; i++) {
			int[][] ns = new int[H][lw];
			int z = i;
			int ct = 0;
			while(z > 0) {
				int r = ct/lw;
				int c = ct%lw;
				ns[r][c] = z & 0x01;
				z = z >> 1;
				ct++;
			}
			if(check(ns) == K) {
				ans++;
			}

		}
		ans = ans % 1000000007;
		System.out.println(ans);

	}
	public static int check(int[][] ns) {
		int p = 0;

		for(int i=0;i<ns.length;i++) {

			for(int j=0,l=ns[i].length;j<l;j++) {
				if(ns[i][j] == 1) {
					if(j>0 && ns[i][j-1] == 1) {
						return -1;
					}else if(j<l-1 && ns[i][j+1] == 1) {
						return -1;
					}

					if(j == p) {
						p++;
						break;
					}else if(j== p -1) {
						p--;
						break;
					}
				}

			}
		}

		return p+1;


	}
}
