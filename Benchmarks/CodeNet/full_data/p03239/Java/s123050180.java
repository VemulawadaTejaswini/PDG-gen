import java.util.Scanner;

class Main{
	static final long MOD = 1000000007;

	static int H, W, K;
	static long[][] dp = new long[110][10];
	static int ans = 0;
	static long n = 0;





	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);			//文字の入力
		int n = sc.nextInt();
		int T = sc.nextInt();

		int ans = 1000000000;
		for(int i = 0;i < n;i++){
			int	c = sc.nextInt();
			int	t = sc.nextInt();
			if(t <= T){
				ans = Math.min(ans, c);
			}

		}
		if(ans == 1000000000){
			System.out.println("TLE");
		}else{
			System.out.println(ans);
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

		return end - otherpair.end;
	}
}

