import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int[] dh = {1,-1,0,0};
		int[] dw = {0,0,1,-1};
		Scanner sc = new Scanner(System.in);
		int H = Integer.parseInt(sc.next());
		int W = Integer.parseInt(sc.next());
		char[][] map = new char[H][W];
		for(int i=0; i<H; i++) {
			map[i] = sc.next().toCharArray();
		}
		char[][] tmp_map = new char[H][W];

		boolean flag = true;
		int ans = 0;
		while(flag) {
			for(int h=0;h<H;h++) {
				for(int w=0;w<W;w++) {
					tmp_map[h][w] = map[h][w];
				}
			}
			ans++;
			for(int h=0;h<H;h++) {
				for(int w=0;w<W;w++) {
					if(tmp_map[h][w]=='#'){
						for(int i=0;i<4;i++) {
							int nh = h+dh[i];
							int nw = w+dw[i];
							if(nh>=H || nh<0)continue;
							if(nw>=W || nw<0)continue;
							map[nh][nw] = '#';
						}
					}
				}
			}
			flag = false;
			b:for(int h=0;h<H;h++) {
				for(int w=0;w<W;w++) {
					if(map[h][w]=='.') {
						flag = true;
						break b;
					}
				}
			}
			//System.out.println("aa");
		}
		System.out.println(ans);
	}

}
