
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int h = Integer.parseInt(sc.next());
		int w = Integer.parseInt(sc.next());
		
		int k = Integer.parseInt(sc.next());
		
		char [][]c = new char [h][w];
		
		for(int i = 0 ; i < h ;i++) {
			String s = sc.next();
			for(int j = 0 ; j < w ;j++) {
				c[i][j] = s.charAt(j);
				
			}
		}
		
		int ans = 1000000000;
		//切れ目となりうる数はh-1箇所
		for(int i = 0 ; i < (1 << h-1) ;i++) {
			
			int gnum = 0; 	// 横に区切ることでできるチョコの枚数
			int [] d = new int [h]; 	//列ごとでどのグループに属するか
			
			for(int j = 0 ; j < h -1 ; j++) {
				if((i >> j & 1) == 1 ) {
					d[j+1] = d[j] + 1;	//切れ目が存在するとき
					gnum++;
				}
				else {
					d[j+1] = d[j];	//切れ目が存在しないとき
				}
			}
			
			int wcut = 0; //縦方向にいくつ切れ目を入れるか
			boolean jdg = true;	//そもそも適切に切ることができるのかどうか
			int []num = new int [gnum+1]; //グループにいくつ白チョコがあるか
			
			for(int j = 0 ; j < w ; j++) {
				boolean ok = true; 	//j行目を区切る必要があるかのチェック
				int []can = new int [gnum+1]; 	//一列につきk個以上の白チョコがあるか
				for(int l = 0 ; l < h ; l++) {
					num[d[l]] += c[l][j] - '0';
					can[d[l]] += c[l][j] - '0';
					if(num[d[l]] > k) {
						ok = false;
					}
					if(can[d[l]] > k) {
						jdg = false;
					}
				}
				if(!ok) {
					wcut++;
					num = can; //j行目でk個を超えたのでj-1とj行の間で切る。
							   //新しいグループとしてj行目以降から始める
							
				}
			}
			if(jdg) {
				ans = Math.min(ans, gnum + wcut);		
			}
		}
		
		System.out.println(ans);
	}
}
