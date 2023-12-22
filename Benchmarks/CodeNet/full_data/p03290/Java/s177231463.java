import java.util.Scanner;

class Main{
	static int G;
	static int D;
	static int[] p;
	static int[] c;
	static boolean[] used;

	static long ans = 1000000000;


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);			//文字の入力
		D = sc.nextInt();
		G = sc.nextInt();
		p = new int[D];
		c = new int[D];
		for(int i = 0;i < D;i++){
			p[i] = sc.nextInt();
			c[i] = sc.nextInt();
		}
		for(int i = 0;i < D;i++){
			used = new boolean[D];

			dfs(i,0,0);
		}

		System.out.println(ans);



	}
	static void dfs(int p,int sum,int count){
		used[p] = true;
		System.out.println("sum " + sum );

		System.out.println("used " + used[0] + " 0 " );
		System.out.println("used " + used[1] + " 1 " );

		if(p == D){
			return;
		}
		if(sum >= G){
			ans = Math.min(ans, count);
			return;
		}

		for(int i = 0;i < Main.p[p];i++){
			sum += (p+1)*100;
			if(i == Main.p[p]-1){			//ボーナス
				sum += c[p];
			}
			count++;
			if(sum >= G){
				ans = Math.min(ans, count);
				return;
			}
		}


		for(int i = 0;i < D;i++){
			if(!used[i]){
				dfs(i, sum, count);
			}
		}



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

		return from - otherpair.from;
	}
}

