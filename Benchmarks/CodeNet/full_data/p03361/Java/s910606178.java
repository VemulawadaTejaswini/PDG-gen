import java.util.Scanner;

class Main{

	static int H;
	static int W;
	static char[][] map;
	static int ans;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);			//文字の入力
		H = sc.nextInt();
		W = sc.nextInt();
		map = new char[H][W];
		for(int i = 0;i < H;i++){
			String xx = sc.next();
			for(int j = 0;j < W;j++){
				map[i][j] = xx.charAt(j);
			}
		}	
		ans = 0;
		for(int i = 0;i < H;i++){
			for(int j = 0;j < W;j++){
				if(map[i][j] == '#'){
					dfs(i,j,0);
				}
			}
		}	

		if(ans == -1){
			System.out.println("No");
		}else{
			System.out.println("Yes");

		}
	}


	static void dfs(int y,int x,int count){

		int[] dx ={-1,1,0,0};
		int[] dy ={0,0,1,-1};

		for(int i = 0;i < 4;i++){
			int nx = x + dx[i];
			int ny = y + dy[i];
			if(nx >= 0 && nx < W && ny >= 0 && ny < H){
				if(map[ny][nx] == '#'){
					map[ny][nx] = '.';
					count++;
					dfs(ny, nx, count);
				}
			}
		}

		if(count == 0){
			ans = -1;
		}



	}
}

class UnionFind{
	int[] parent;
	public UnionFind(int N){
		this.parent = new int[N];
		for(int i = 0; i < N;i++){
			parent[i] = i;
		}
	}
	public int root(int x){			//根要素を取得
		if(parent[x] == x){			//初期状態
			return x;
		}else{
			return parent[x] = root(parent[x]);    	//再帰によって根を取得
		}
	}
	public void unite(int x,int y){ 	//統合メソッド
		if(same(x,y)){					//同じ根なら終了
			return;
		}
		int xroot = root(x);
		int yroot = root(y);
		parent[xroot] = yroot;			//統合
		return;

	}

	public boolean same(int x,int y){			//根が同じか（同じグループに属しているか）を判定
		return(root(x) == root(y));
	}
}



class Pair implements Comparable{
	int from;		//p
	int end;		//y
	int num;
	int bango;
	@Override
	public int compareTo(Object other) {
		Pair otherpair = (Pair)other;

		return end - otherpair.end;
	}
}

