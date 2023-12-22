import java.util.Scanner;

public class B {

	static Scanner scan = new Scanner(System.in);
	static int N = scan.nextInt();
	static int M = scan.nextInt();
	static int dp[][]=new int[N][N];
	static int count;
	static int color[]=new int[N];

	public static void paint(int v,int c){
		if(count<0){return;}
		for(int j=0;j<N;j++){
			if(dp[v][j]==1){
				count--;
				paint(j,c);
				count++;
				color[j]=c;
			}
		}

	}

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		int a[] = new int[M];
		int b[] = new int[M];

		for(int i =0;i<M;i++){
			a[i]=scan.nextInt()-1;
			b[i]=scan.nextInt()-1;
			dp[a[i]][b[i]]=1;
			dp[b[i]][a[i]]=1;
			//a_i,b_iは0 ~ N-1
			//二つがつながっていたらdp=1
		}

		int Q = scan.nextInt();
		int v[] = new int[Q];
		int d[] = new int[Q];
		int c[] = new int[Q];

		for(int i =0;i<Q;i++){
			v[i]=scan.nextInt() - 1;
			d[i]=scan.nextInt();
			c[i]=scan.nextInt();
		}

		//ここから塗りつぶし動作
		for(int i =0;i<Q;i++){
			count = d[i];
					paint(v[i],c[i]);

			}

		for(int i=0;i<N;i++){
			System.out.println(color[i]);
		}

		}

	}
