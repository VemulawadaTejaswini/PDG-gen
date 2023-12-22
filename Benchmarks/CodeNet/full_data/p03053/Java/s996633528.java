import java.util.*;
public class Main {
	int h;
	int w;
	int[][] hw;
	int q = 0;
	int qnum = 0;
	int[][] queue = new int[2][8000];
	int max = 0;

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
				if(S[x].equals("#")){
					hw[y][x]=0;
					queue[0][qnum]=y;
					queue[1][qnum]=x;
					qnum++;
				} else {
					hw[y][x]=2000;
				}
			}
		}

		//走査
		while(q<qnum){
			//System.out.println(queue[0][q]+";"+queue[1][q]);
			change(queue[0][q],queue[1][q]);
			q++;
		}

		// 出力
		System.out.println(max);
	}

	public void change(int y,int x){
		if(y+1<h&&hw[y+1][x]>hw[y][x]+1){
			hw[y+1][x]=hw[y][x]+1;
			queue[0][qnum]=y+1;
			queue[1][qnum]=x;
			qnum++;
			if(max<hw[y][x]+1)max = hw[y][x]+1;
		}
		if(y>0&&hw[y-1][x]>hw[y][x]+1){
			hw[y-1][x]=hw[y][x]+1;
			queue[0][qnum]=y-1;
			queue[1][qnum]=x;
			qnum++;
			if(max<hw[y][x]+1)max = hw[y][x]+1;
		}
		if(x>0&&hw[y][x-1]>hw[y][x]+1){
			hw[y][x-1]=hw[y][x]+1;
			queue[0][qnum]=y;
			queue[1][qnum]=x-1;
			qnum++;
			if(max<hw[y][x]+1)max = hw[y][x]+1;
		}
		if(x+1<w&&hw[y][x+1]>hw[y][x]+1){
			hw[y][x+1]=hw[y][x]+1;
			queue[0][qnum]=y;
			queue[1][qnum]=x+1;
			qnum++;
			if(max<hw[y][x]+1)max = hw[y][x]+1;
		}
	}

	public static void main(String[] args){
		new Main();
	}
}