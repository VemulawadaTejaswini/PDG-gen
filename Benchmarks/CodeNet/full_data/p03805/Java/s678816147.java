import java.util.Scanner;



public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		int M = Integer.parseInt(sc.next());
		boolean[][] path =new boolean[N][N];
		for(int i=0;i<N;i++) for(int j=0;j<N;j++) path[i][j]=false;
		for(int i=0;i<M;i++){	//隣接行列の受け取り
			int a = Integer.parseInt(sc.next());
			int b = Integer.parseInt(sc.next());
			path[(a-1)][(b-1)] = true;
			path[(b-1)][(a-1)] = true;
		}
		
		boolean[] position = new boolean[N];//訪問済みならtrue
		position[0]=true;
		for(int i = 1; i<N;i++) position[i]=false;//初期化;
		
		int cnt = Search(N, 0, position, path);
		
		System.out.println(cnt);
		sc.close();
	}

	public static int Search(int N, int NowPos, boolean[] PastPos, boolean[][] path){
		int cnt=0;
		boolean all_visited = true;//全て訪問済みならtrue
		for(boolean Posi: PastPos) all_visited = (all_visited && Posi);
		
		
		if(all_visited)	cnt=1;
		for(int j=1;j<N;j++){
			boolean[] NewPos = new boolean[N];
			for(int i=0;i<N;i++) NewPos[i]=PastPos[i];
			if((!PastPos[j])&&path[NowPos][j]){
				NewPos[j]=true;
				//for(int k=0;k<N; k++)System.out.println(NewPos[k]);
				//System.out.println("is NewPos.");
				cnt+=Search(N,j,NewPos,path);
			}
		}
		return cnt;
	}
}
