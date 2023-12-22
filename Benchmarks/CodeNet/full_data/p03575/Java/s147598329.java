import java.util.Scanner;

public class Main {
	public static int M;
	public static int N;
	public static boolean[][] A;
	public static boolean[] visited ;
public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		//A
		/*int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		if(a == c){
			System.out.println(b);
		}else if(b == c){
			System.out.println(a);
		}else if(b == a){
			System.out.println(c);
		}else{
			System.out.println("error!");
		}
	}*/

		//B
		/*int Height = sc.nextInt();
		int Weight = sc.nextInt();
		if(Height < 1 || Weight > 50){
			System.out.println("error!");
		}

		String[] S = new String[Height];
		for(int i = 0 ; i < Height ; i ++){
			S[i] = sc.next();
		}
		int BombCounter;
		for(int i = 0; i < Height ; i++){
			for(int j = 0; j < Weight ; j++){
				BombCounter = 0;
				if(i != 0 && j >= 1){
					if(S[i-1].charAt(j-1)== '#'){
						BombCounter ++;
					}
				}
				if(i != 0){
					if(S[i-1].charAt(j)== '#'){
						BombCounter ++;
					}
				}
				if(i != 0 && j <= Weight - 2){
					if(S[i-1].charAt(j+1)== '#'){
						BombCounter ++;
					}
				}
				if(j >= 1){
					if(S[i].charAt(j-1)== '#'){
						BombCounter ++;
					}
				}
				if(S[i].charAt(j)== '#'){
					BombCounter ++;
				}
				if(j <= Weight -2){
					if(S[i].charAt(j+1)== '#'){
						BombCounter ++;
					}
				}
				if(i <= Height -2 && j >= 1){
					if(S[i+1].charAt(j-1)== '#'){
						BombCounter ++;
					}
				}
				if(i <= Height-2){
					if(S[i+1].charAt(j)== '#'){
						BombCounter ++;
					}
				}
				if(i <= Height-2 && j <= Weight -2){
					if(S[i+1].charAt(j+1)== '#'){
						BombCounter ++;
					}
				}
				if(S[i].charAt(j)=='.'){
					System.out.print(BombCounter);
				}else{
					System.out.print("#");
				}
			}
			System.out.print("\n");
		}*/

		//C
		N = sc.nextInt();						//頂点の数の入力
		M = sc.nextInt();						//辺の数の入力
		int ans = 0;								//答えを保存する変数ans
		boolean bridge = false;
		A = new boolean[N][N];				//隣接行列A
		visited = new boolean[N];
		int[] a = new int[M];
		int[] b = new int[M];
		//Arrays.fill(A, false);					//Aの初期化
		for(int i = 0 ; i < M ; i++){
			a[i] = sc.nextInt();
			b[i] = sc.nextInt();
			a[i]--;
			b[i]--;
		}

		for(int i = 0; i < M; i++){
			A[a[i]][b[i]] = true;
			A[b[i]][a[i]] = true;
		}

		for(int i = 0 ; i < M ; i++){
			A[a[i]][b[i]] = false;
			A[b[i]][a[i]] = false;
			for(int x = 0 ; x < N ; x++){
				visited[x] = false;
			}
			bridge = false;
			DFS(N-1);
			for(int i2 = 0; i2 < N ; i2++){
				//System.out.println(i2 +","+visited[i2]);
				if(!visited[i2]){
					bridge = true;
				}
			}
			if(bridge){
				ans++;
			}
			A[a[i]][b[i]] = true;
			A[b[i]][a[i]] = true;
		}
		System.out.println(ans);

	}

	public static  void DFS(int a){
		visited[a] = true;
		for(int i = 0; i < N ; i++){
			if(A[a][i] && !visited[i]){
				DFS(i);
			}
		}
	}
}
