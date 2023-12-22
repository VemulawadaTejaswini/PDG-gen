import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		new Main().solve();
	}
	int H,W,K;
	String[]A;
	void solve(){
		Scanner sc=new Scanner(System.in);
		int count=0;
		H=sc.nextInt();
		W=sc.nextInt();
		K=sc.nextInt(); //=魔法の移動回数=開けられる部屋の個数
		A=new String[H];
		for(int i=0;i<H;i++){
			A[i]=sc.next();
		}
		int fx=-1;
		int fy=-1;
		for(int i=0;i<H;i++){
			for(int j=0;j<W;j++){
				if(A[i].charAt(j)=='S'){
					fx=j;
					fy=i;
				}
			}
		}
		Queue<Integer> nowq=new LinkedList<Integer>();
		nowq.add(encode(fy,fx));
		
		int[] vy=new int[]{1,0,-1,0};
		int[] vx=new int[]{0,1,0,-1};
		
		boolean[][] check=new boolean[H][W];
		check[fy][fx]=true;
		
			count++;
			//開けた部屋を入れるキュー
			Queue<Integer> nextq=new LinkedList<Integer>();
			
			while(!nowq.isEmpty()){
				int now=nowq.poll();
				int y=now/1000;
				int x=now%1000;
				//K回まで移動できる
				for(int i=0;i<K;i++){
					for(int j=0;j<4;j++){
						int ny=y+vy[j];
						int nx=x+vx[j];
					
						if(!ok(ny,nx))continue;
					
						if(check[ny][nx])continue;
					
						check[ny][nx]=true;
					
						if(A[ny].charAt(nx)!='#' && (ny==0 || ny==H-1 || nx==0 || nx==W-1)){
							System.out.println(count);
							return;
						}
						else if(A[ny].charAt(nx)=='#'){
							nextq.add(encode(ny,nx));
						}
						else{
							nowq.add(encode(ny,nx));
						}
					}
				}
			}
			nowq=nextq;
			
			while(true){
				count++;
				//開けた部屋を入れるキュー
				Queue<Integer> nq=new LinkedList<Integer>();
				
				while(!nowq.isEmpty()){
					int now=nowq.poll();
					int y=now/1000;
					int x=now%1000;
					//K回まで移動できる
					for(int i=0;i<K;i++){
						for(int j=0;j<4;j++){
							int ny=y+vy[j];
							int nx=x+vx[j];
						
							if(!ok(ny,nx))continue;
						
							if(check[ny][nx])continue;
						
							check[ny][nx]=true;
						
							if(ny==0 || ny==H-1 || nx==0 || nx==W-1){
								System.out.println(count);
								return;
							}
							nowq.add(encode(ny,nx));
						}
					}
				}
				nowq=nq;
			}
		}
	int encode(int y,int x){
		return y*1000+x;
	}
	boolean ok(int y,int x){
		return y>=0 && x>=0 && y<H && x<W;
	}
}