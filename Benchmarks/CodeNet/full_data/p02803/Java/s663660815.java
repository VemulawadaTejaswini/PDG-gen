import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main{
	public static void main(String[]args) {
		try(Scanner scan = new Scanner(System.in)){
			
			int H = scan.nextInt();
			int W = scan.nextInt();
			
			String [] s = new String[H];
			char[][]S = new char[H][W];
			MAP[][] map = new MAP[H][W];
			
			
			for(int i =0 ;i<H;i++) {
				s[i] = scan.next();
				S[i] = s[i].toCharArray();	
			}
			
			for(int i = 0;i<H;i++) {
				for(int j=0;j<W;j++) {
					map[i][j] = new MAP(i,j,S[i][j]);
				}
			}
			int max = 0;
			
			int []dy = {-1,0,1,0};
			int []dx = {0,1,0,-1};
			int starty =0;
			int startx =0;
			
			
			for(int i = 0;i<H;i++) {
				for(int j=0;j<W;j++) {
					if(map[i][j].type=='.') {
					 starty = i;
					 startx = j;
					}
					
					Deque<MAP> queue = new ArrayDeque<MAP>();
					queue.addFirst(map[starty][startx]);
					map[starty][startx].check=true;
					
					while(!queue.isEmpty()) {
						MAP p = queue.removeLast();
						
						for(int v=0;v<4;v++){//上下左右移動方向を調べる
							int x = p.X+dx[v];
							int y = p.Y+dy[v];
							
							if(0<=x&&x<W&&y>=0&&y<H){
								if(map[y][x].type=='.' && map[y][x].check==false){
									queue.addFirst(map[y][x]);
									map[y][x].count = p.count+1;
									map[y][x].check = true; //追加した座標を探索済みにする
									}
								}
							}		
						}
					
					int imax = 0;
					for(int z = 0;z<H;z++) {
						for(int w=0;w<W;w++) {
							if(imax<map[z][w].count)imax = map[z][w].count;
							map[z][w].count = 0;
							map[z][w].check = false;
						}
					}
					if(max<imax)max = imax;
					
					
					
				}	
			}
				
	
			
		System.out.println(max);
	
	
	
		}
	}
}



class MAP{
	int Y;
	int X;
	boolean check = false;
	char type;
	int count = 0;
	MAP(int y,int x,char t){
		Y = y;X = x;type = t;
	}
}
