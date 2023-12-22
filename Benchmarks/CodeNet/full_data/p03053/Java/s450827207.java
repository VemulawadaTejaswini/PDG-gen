import java.util.*;
public class Main {
	int h;
	int w;
	int[][] hw;
	boolean flg = true;
	int count = 0;

	Main(){
		Scanner sc = new Scanner(System.in);

		// 整数の入力
		h = sc.nextInt();
		w = sc.nextInt();
		hw = new int[h][w];

		// 文字列の入力
		for(int y=0;y<h;y++){
			String s = sc.next();
			String[] S = s.split("");
			for(int x=0;x<w;x++){
				hw[y][x] = S[x].equals("#")?0:10000;
			}
		}

		//走査
		while(flg){
			flg = false;
			for(int y=0;y<h;y++){
				for(int x=0;x<w;x++){
					if(hw[y][x]==count){
						change(y,x);
					}
				}
			}
			count++;
		}

		// 出力
		System.out.println(--count);
	}

	public void change(int y,int x){
		if(y+1<h&&hw[y+1][x]>hw[y][x]+1){
			hw[y+1][x]=hw[y][x]+1;
			flg=true;
		}
		if(y>0&&hw[y-1][x]>hw[y][x]+1){
			hw[y-1][x]=hw[y][x]+1;
			flg=true;
		}
		if(x>0&&hw[y][x-1]>hw[y][x]+1){
			hw[y][x-1]=hw[y][x]+1;
			flg=true;
		}
		if(x+1<w&&hw[y][x+1]>hw[y][x]+1){
			hw[y][x+1]=hw[y][x]+1;
			flg=true;
		}
	}

	public static void main(String[] args){
		new Main();
	}
}