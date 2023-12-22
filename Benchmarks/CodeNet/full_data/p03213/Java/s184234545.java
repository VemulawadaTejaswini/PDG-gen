import java.util.Scanner;

class Main{
	static final long MOD = 1000000007;

	static int H, W, K;
	static long[][] dp = new long[110][10];
	static int ans = 0;
	static long n = 0;


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);			//文字の入力
		n = sc.nextLong();
		int[] p = {2,3,5,7,11,13,17,19, 23 ,29, 31, 37, 41, 43, 47};
		int[] a = new int[15];
		int c2 = 0;
		int c4 = 0;
		int c14 = 0;
		int c24 = 0;
		int c74 = 0;
		for(int i =2;i <= n;i++){
			int d = i;
			for(int j = 0;j < 15;j++){
				while(d%p[j] == 0){
					a[j]++;
					d /= p[j];
				}
			}
		}
		int a3 = 0;
		int a5 = 0;
		int a15 = 0;
		int a25 = 0;
		int a75 = 0;

		for(int i=0; i<15; i++) {		//合計でべき乗が何個あるかカウント
			if(a[i] >= 74) a75++;
			if(a[i] >= 24) a25++;
			if(a[i] >= 14) a15++;
			if(a[i] >= 4) a5++;
			if(a[i] >= 2) a3++;
		}

		int res = 0;

		res += a75;
		res += a25 * (a3 - 1);			//合計で75になる組み合わせの数
		res += a15 * (a5 - 1);
		res += (a5 * (a5-1) / 2) * (a3 - 2);
		System.out.println(res);
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
