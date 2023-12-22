import java.util.Scanner;

class Main{

	static char[][] map;
	static int H;
	static int W;
	static	int D ;
	static	int G ;
	static	int[] p;
	static	int[] c;
	static int ans = 100000000;

	public static void main(String[] args) {



		Scanner sc = new Scanner(System.in);			//文字の入力
		D = sc.nextInt();
		G = sc.nextInt();
		p = new int[D+1];
		c = new int[D+1];

		for(int i = 1;i < D+1;i++){
			p[i] = sc.nextInt();
			c[i] = sc.nextInt();
		}

		for(int i = p[D];i >= 0;i--){			//一番でかい問題の個数でdfs
			if(i == p[D]){
				dfs(D-1,i,100*D*i+c[D]);


			}else{

				dfs(D-1,i,100*D*i);
			}
		}

		System.out.println(ans);

	}

	static void dfs(int mondai,int sum,int score){			//numは数、mondaiは問題番号,sumは問題をといた数

		if(sum >= ans){
			return;
		}

		if(score >= G){
			ans = Math.min(ans, sum);
			return;
		}
		if(mondai < 1){
			return;
		}

		for(int i = p[mondai];i >= 0;i--){
			if(i == p[mondai]){
				dfs( mondai-1, sum+i, score+100*mondai*i+c[mondai]);

			}else{

				dfs( mondai-1, sum+i, score+100*mondai*i);
			}
		}

		return;





	}


}



