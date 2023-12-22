import java.util.Arrays;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int H = sc.nextInt();
		int W = sc.nextInt();
		int ans = 0;
		String[][] map = new String[H][W];
		for(int i=0; i<H;i++){
			String str = sc.next();
			String[] line = str.split("");
			for(int n=0; n<W; n++){
				map[i][n]=line[n];
			}
			
		}
		for(int i=0; i<H;i++){
			for(int j=0; j<W; j++){
				if (map[i][j].equals("#")){
					String[][] map_for_count = new String[H][W];
					for(int a=0;a<H ;a++){
						for(int b=0; b<W; b++){
							map_for_count[a][b] = "Y";
						}
					}
					ans += count(H,W,map,map_for_count,i,j);
				}
			}
		}
		System.out.println(ans);
	}
	
	public static int count(int H, int W, String[][] map, String[][] map_for_count, int i, int j){
		int tmp = 0;
		if(!isInH(i,H)||!isInW(j,W)){
			return 0;
		}
			map_for_count[i][j] = "X";//探索済みのフラグ
		//現在地が黒マスの場合
		if(map[i][j].equals("#")){
			//上のマスが白かつ、新しく通る道の場合
			if(isInH(i-1,H)&&isInW(j,W)
					&&map[i-1][j].equals(".")
					&&!map_for_count[i-1][j].equals("X")){
				tmp += 1+count(H,W,map,map_for_count,i-1,j);
			}
			//下のマスが白かつ、新しく通る道の場合
			if(isInH(i+1,H)&&isInW(j,W)
					&&map[i+1][j].equals(".")
					&&!map_for_count[i+1][j].equals("X")){
				tmp += 1+count(H,W,map,map_for_count,i+1,j);
			}
			//右のマスが白かつ、新しく通る道の場合
			if(isInH(i,H)&&isInW(j+1,W)
					&&map[i][j+1].equals(".")
					&&!map_for_count[i][j+1].equals("X")){
				tmp += 1+count(H,W,map,map_for_count,i,j+1);
			}
			//左のマスが白かつ、新しく通る道の場合
			if(isInH(i,H)&&isInW(j-1,W)
					&&map[i][j-1].equals(".")
					&&!map_for_count[i][j-1].equals("X")){
				tmp += 1+count(H,W,map,map_for_count,i,j-1);
			}
		}
			
		//現在地が白マスの場合
		if(map[i][j].equals(".")){
			//上のマスが黒かつ、新しく通る道の場合
			if(isInH(i-1,H)&&isInW(j,W)
					&&map[i-1][j].equals("#")
					&&!map_for_count[i-1][j].equals("X")){
				tmp += count(H,W,map,map_for_count,i-1,j);
			}
			//下のマスが黒かつ、新しく通る道の場合
			if(isInH(i+1,H)&&isInW(j,W)
					&&map[i+1][j].equals("#")
					&&!map_for_count[i+1][j].equals("X")){
				tmp += count(H,W,map,map_for_count,i+1,j);
			}
			//右のマスが黒かつ、新しく通る道の場合
			if(isInH(i,H)&&isInW(j+1,W)
					&&map[i][j+1].equals("#")
					&&!map_for_count[i][j+1].equals("X")){
				tmp += count(H,W,map,map_for_count,i,j+1);
			}
			//左のマスが黒かつ、新しく通る道の場合
			if(isInH(i,H)&&isInW(j-1,W)
					&&map[i][j-1].equals("#")
					&&!map_for_count[i][j-1].equals("X")){
				tmp += count(H,W,map,map_for_count,i,j-1);
			}
		
		}
		return tmp;
	}
	
	public static boolean isInH(int h, int H){
		if(h<0)return false;
		if(h>H-1)return false;
		return true;
	}
	public static boolean isInW(int w, int W){
		if(w<0)return false;
		if(w>W-1)return false;
		return true;
	}

}
