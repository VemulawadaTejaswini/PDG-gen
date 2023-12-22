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
		Deque<Boolean> Key=new ArrayDeque<Boolean>();
		Deque<Integer> Cout=new ArrayDeque<Integer>();
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
		if(map[0][0]){
			Key.add(true);
			Cout.add(1);
			min[0][0]=1;
		}
		else{
			Cout.add(0);
			Key.add(false);
		}
		while(X.size()>0){
			int x=X.poll();
			int y=Y.poll();
			boolean key=Key.poll();
			boolean ri=false;
			int cout=Cout.poll();
			if(x+1<W){
				if(map[y][x+1]){
					if(key==false){
						cout++;
						ri=true;
					}
					key=true;
				}
				if(map[y][x+1]==false)
					key=false;
				X.add(x+1);Y.add(y);Cout.add(cout);Key.add(key);
				if(visit[y][x+1]){
					if(min[y][x+1]>cout){
						min[y][x+1]=cout;
						X.add(x+1);Y.add(y);Cout.add(cout);Key.add(key);
					}
				}
				if(visit[y][x+1]==false){
					min[y][x+1]=cout;
					visit[y][x+1]=true;
					X.add(x+1);Y.add(y);Cout.add(cout);Key.add(key);
				}
			}
			if(ri)
				cout--;
			if(y+1<H){
				if(map[y+1][x]){
					if(key==false){
						cout++;
					}
					key=true;
				}
				if(map[y+1][x]==false)
					key=false;
				X.add(x);Y.add(y+1);Cout.add(cout);Key.add(key);
				if(visit[y+1][x]){
					if(min[y+1][x]>cout){
						min[y+1][x]=cout;
						X.add(x);Y.add(y+1);Cout.add(cout);Key.add(key);
					}
				}
				if(visit[y+1][x]==false){
					min[y+1][x]=cout;
					visit[y+1][x]=true;
					X.add(x);Y.add(y+1);Cout.add(cout);Key.add(key);
				}
			}
		}
		System.out.println(min[H-1][W-1]);
	}
}
