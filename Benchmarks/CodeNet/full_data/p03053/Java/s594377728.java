import java.util.*;
public class Main {
	int h;
	int w;
	int[][] hw;
	int q = 0;
	int qnum = 0;
	ArrayList<Integer> queue = new ArrayList<Integer>();
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
					queue.add(y);
					queue.add(x);
					qnum+=2;
				} else {
					hw[y][x]=2000;
				}
			}
		}

		//走査
		while(q<qnum){
			change(queue.get(q),queue.get(q+1));
			q+=2;
		}

		// 出力
		System.out.println(max);
	}

	public void change(int y,int x){
		if(y+1<h&&hw[y+1][x]>hw[y][x]+1){
			hw[y+1][x]=hw[y][x]+1;
			queue.add(y+1);
			queue.add(x);
			qnum+=2;
			if(max<hw[y][x]+1)max = hw[y][x]+1;
		}
		if(y>0&&hw[y-1][x]>hw[y][x]+1){
			hw[y-1][x]=hw[y][x]+1;
			queue.add(y-1);
			queue.add(x);
			qnum+=2;
			if(max<hw[y][x]+1)max = hw[y][x]+1;
		}
		if(x>0&&hw[y][x-1]>hw[y][x]+1){
			hw[y][x-1]=hw[y][x]+1;
			queue.add(y);
			queue.add(x-1);
			qnum+=2;
			if(max<hw[y][x]+1)max = hw[y][x]+1;
		}
		if(x+1<w&&hw[y][x+1]>hw[y][x]+1){
			hw[y][x+1]=hw[y][x]+1;
			queue.add(y);
			queue.add(x+1);
			qnum+=2;
			if(max<hw[y][x]+1)max = hw[y][x]+1;
		}
	}

	public static void main(String[] args){
		new Main();
	}
}