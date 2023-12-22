import java.util.Scanner;

public class Main {//マインスウィーパー
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		int H = scan.nextInt();
		int W = scan.nextInt();
		String[] S = new String[H];
		
		for(int i = 0;i<H;i++){
			S[i] = scan.next();
		}
		
		
		char[][] map = new char[H][W];
		
		for(int i = 0;i<H;i++){
			map[i] = S[i].toCharArray();
		}
		
		
		int dx[] = {0,1,1,1,0,-1,-1,-1};
		int dy[] = {1,1,0,-1,-1,-1,0,1};
		
		
		
		
		for(int i = 0;i<H;i++){
			for(int j = 0;j<W;j++){
				int bomcount = 0;
				
				if(map[i][j]=='.') {//まず前提としてあいたマスをチェック
					
					for(int z =0;z<8;z++){//そしたら八方向二爆弾があるかチェック
						int x = j+dx[z];
						int y = i+dy[z];
						if(0<=x&&x<W&&0<=y&&y<H){//もちろんマップ範囲内で
							if(map[y][x]=='#'){
								bomcount +=1;//見つけたらボムカウント入れる
							}
						}
					}
					
					//map[i][j] = String.valueOf(bomcount).charAt(0);//チェックし終わったらあいたマスをボムカウントに変えておく
					map[i][j] = (char)('0'+bomcount);
					
					
				}	
				
				
			}
		}
		

		for(int i = 0;i<H;i++){
			for(int j = 0;j<W;j++){
				System.out.print(map[i][j]);
				
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
	}

}
