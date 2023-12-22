import java.util.Scanner;

class Main{
	static int[][] dmap;
	static int n;
	static int[][] smap;
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);			//文字の入力
		n = sc.nextInt();
		int k = sc.nextInt();
		int l = sc.nextInt();
		int[] p = new int[k+1];
		int[] q = new int[k+1];
		for(int i = 1;i <= k;i++){
			p[i] = sc.nextInt();
			q[i] = sc.nextInt();
		}

		dmap = new int[n+1][n+1];				//道路のマップ
		for(int i = 1;i <= n;i++){
			dmap[i][i] = 1;
		}
		for(int i = 1;i <= k;i++){
			dmap[p[i]][q[i]]++;
			dmap[q[i]][p[i]]++;
		}
		
	

		for(int i = 1;i <= n;i++){
			for(int j = 1;j <= n;j++){
				if(i != j){
					boolean[] used = new boolean[n+1];
					used[i] = true;
					ddfs(i,i,j,used);
				}
			}
		}

//		for(int i= 1;i <= n;i++){
//			for(int j = 1;j <= n;j++){
//				System.out.print(dmap[i][j] +" ");
//			}
//			System.out.println();
//		}



		int[] r = new int[l+1];
		int[] s = new int[l+1];
		for(int i = 1;i <= l;i++){
			r[i] = sc.nextInt();
			s[i] = sc.nextInt();
		}

		smap = new int[n+1][n+1];					//鉄道mappu
		for(int i = 1;i <= n;i++){
			smap[i][i] = 1;
		}
		for(int i = 1;i <= l;i++){
			smap[r[i]][s[i]]++;
			smap[s[i]][r[i]]++;

		}
		for(int i = 1;i <= n;i++){
			for(int j = 1;j <= n;j++){
				if(i != j){
					boolean[] used = new boolean[n+1];
					used[i] = true;
					sdfs(i,i,j,used);
				}
			}
		}
//		System.out.println();
//
//		for(int i= 1;i <= n;i++){
//			for(int j = 1;j <= n;j++){
//				System.out.print(smap[i][j] +" ");
//			}
//			System.out.println();
//		}


		for(int i = 1;i <= n;i++){
			int ans = 0;
			for(int j = 1;j <= n;j++){
				if(dmap[i][j] > 0 && smap[i][j] > 0){			//道路でも鉄道でも道があったらプラス１
					ans++;
				}

			}
			System.out.print(ans+" ");
		}

	}
	
	static void ddfs(int s,int p,int g,boolean[] used){			//pは現在の値、gはゴール

		if(p == g){
			dmap[s][g]=1;
			return;
		}

		for(int i = 1;i <= n;i++){
			if(!used[i] && dmap[p][i] > 0){			//使ってなくて道があるならdfs
				used[i] = true;
				ddfs(s,i, g, used);
				used[i] = false;
			}
		}

		return;


	}
	
	
	
	
	
	static void sdfs(int s,int p,int g,boolean[] used){			//pは現在の値、gはゴール

		if(p == g){
			dmap[p][g]=1;
			return;
		}

		for(int i = 1;i <= n;i++){
			if(!used[i] && dmap[p][i] > 0){			//使ってなくて道があるならdfs
				used[i] = true;
				sdfs(s,i, g, used);
				used[i] = false;
			}
		}

		return;


	}
}

