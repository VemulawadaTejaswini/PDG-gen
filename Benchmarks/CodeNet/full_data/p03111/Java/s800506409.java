import java.util.Scanner;

class Main{

static int ans = Integer.MAX_VALUE;
static int[] l;
static int A;
static int B;
static int C;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);			//文字の入力
		int N = sc.nextInt();
		A = sc.nextInt();
		B = sc.nextInt();
		C = sc.nextInt();
		l = new int[N];
		for(int i = 0;i < N;i++){
			l[i] = sc.nextInt();
		}
		
		//深さ優先探索　
		dfs(0,0,0,0,0);
		System.out.println(ans);
	}
	
	static void dfs(int sum,int index,int a,int b,int c){
		if(index == l.length){
			if(a == 0 || b == 0 || c == 0){
				return;
			}else{
				sum += Math.abs(a - A) + Math.abs(b - B) + Math.abs(c - C) - 30;
				ans  = Math.min(ans, sum);
				return;
			}
			
		}
		
		dfs(sum + 10, index+1, a+l[index], b, c);		//index番目の木をAの材料とする
		dfs(sum + 10, index+1, a, b+l[index], c);		//index番目の木をBの材料とする
		dfs(sum + 10, index+1, a, b, c+l[index]);		//index番目の木をCの材料とする
		dfs(sum, index+1, a, b, c);						//index番目の木を使わない

		
		
		
		
		
		
	}
}

