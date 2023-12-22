import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;
public class Main {
	public static void main(String[] args)throws Exception{
		Scanner stdIn=new Scanner(System.in);
		int H=stdIn.nextInt();
		int W=stdIn.nextInt();
		boolean S[][]=new boolean[H][W];
		boolean visit[][]=new boolean[H][W];
		Deque<Integer> Q=new ArrayDeque<Integer>();
		int max=0;
		for(int i=0;i<H;i++){
			String a=stdIn.next();
			for(int j=0;j<W;j++){
				char b=a.charAt(j);
				if(b=='.')
					S[i][j]=true;
			}
		}
		for(int i=0;i<H;i++){
			for(int j=0;j<W;j++){
				if(S[i][j]){
					Q.add(i);Q.add(j);Q.add(0);
					visit[i][j]=true;
					while(Q.size()>0){
						int I=Q.poll();
						int J=Q.poll();
						int cout=Q.poll();
						if(I!=0&&S[I-1][J]&&visit[I-1][J]==false){
							Q.add(I-1);Q.add(J);Q.add(cout+1);
							if(cout+1>max)
								max=cout+1;
							visit[I-1][J]=true;
						}
						if(I!=H-1&&S[I+1][J]&&visit[I+1][J]==false){
							Q.add(I+1);Q.add(J);Q.add(cout+1);
							if(cout+1>max)
								max=cout+1;
							visit[I+1][J]=true;
						}
						if(J!=0&&S[I][J-1]&&visit[I][J-1]==false){
							Q.add(I);Q.add(J-1);Q.add(cout+1);
							if(cout+1>max)
								max=cout+1;
							visit[I][J-1]=true;
						}
						if(J!=W-1&&S[I][J+1]&&visit[I][J+1]==false){
							Q.add(I);Q.add(J+1);Q.add(cout+1);
							if(cout+1>max)
								max=cout+1;
							visit[I][J+1]=true;
						}
					}
					visit=new boolean[H][W];
				}
			}
		}
		System.out.println(max);
	}
}
