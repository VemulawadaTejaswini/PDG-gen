import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;
public class Main {
	public static void main(String[] args)throws Exception{
		Scanner stdIn=new Scanner(System.in);
		int H=stdIn.nextInt();
		int W=stdIn.nextInt();
		Deque<Integer> X=new ArrayDeque<Integer>();
		Deque<Integer> Y=new ArrayDeque<Integer>();
		boolean map[][]=new boolean[H][W];
		boolean visit[][]=new boolean[H][W];
		int min[][]=new int[H][W];
		for(int i=0;i<H;i++){
			String a=stdIn.next();
			for(int j=0;j<W;j++){
				char b=a.charAt(j);
				if(b=='#')
					map[i][j]=true;
			}
		}
		X.add(0);Y.add(0);visit[0][0]=true;
		if(map[0][0])
			min[0][0]=1;
		while(X.size()>0){
			int x=X.poll();
			int y=Y.poll();
			int cout=min[y][x];
			if(x+1<W){
				if(map[y][x]==false&&map[y][x+1])
					cout++;
				if(visit[y][x+1]&&min[y][x+1]>cout)
					min[y][x+1]=cout;
				if(visit[y][x+1]==false){
					min[y][x+1]=cout;
					visit[y][x+1]=true;
				}
			}
			cout=min[y][x];
			if(y+1<H){
				if(map[y][x]==false&&map[y+1][x])
					cout++;
				if(visit[y+1][x]&&min[y+1][x]>cout)
					min[y+1][x]=cout;
				if(visit[y+1][x]==false){
					min[y+1][x]=cout;
					visit[y+1][x]=true;
				}
			}
		}
		System.out.println(min[H-1][W-1]);
	}
}
