import java.util.*;

public class Main{
	static final int mod=1000000007;
	static final int[] dx={0,0,1,-1},dy={1,-1,0,0};

	public static void main(String[] $){
		Scanner s=new Scanner(System.in);
		int h=s.nextInt(),w=s.nextInt();

		char[][] f=new char[h][w];
		Arrays.setAll(f,i->s.next().toCharArray());

		int[][] wf=new int[h*w][h*w];
		for(int i=0;i<h*w;++i){
			Arrays.fill(wf[i],999);
			wf[i][i]=0;
		}

		for(int y=0;y<h;++y){
			for(int x=0;x<w;++x){
				if(f[y][x]!='.')
					continue;
				for(int d=0;d<4;++d){
					int ny=y+dy[d];
					int nx=x+dx[d];
					if(0<=nx&&nx<w&&0<=ny&&ny<h&&f[ny][nx]=='.')
						wf[y*w+x][ny*w+nx]=wf[ny*w+nx][y*w+x]=1;
				}
			}
		}

		//wf
		for(int k=0;k<h*w;++k)
			for(int i=0;i<h*w;++i)
				for(int j=0;j<h*w;++j)
					wf[i][j]=Math.min(wf[i][j],wf[i][k]+wf[k][j]);

		int r=0;
		for(int i=0;i<h*w;++i)
			for(int j=0;j<h*w;++j)
				r=Math.max(r,wf[i][j]<999?wf[i][j]:0);
		System.out.println(r);
	}
}
