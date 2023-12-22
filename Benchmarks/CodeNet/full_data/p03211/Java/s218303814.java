import java.util.Scanner;

class Main{
	static final long MOD = 1000000007;

	static int H, W, K;
	static long[][] dp = new long[110][10];
	static int ans = 0;
	static int n = 0;
	static long x = 0;
	static long[] X;
	static long[] P;




	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);			//文字の入力
		String ss = sc.nextLine();
		int ans = 1100000;
		for(int i = 0;i + 2 < ss.length();i++){
			String x = ss.substring(i, i + 3); 
			int num = Integer.parseInt(x);
			num = Math.abs(num-753);
			ans = Math.min(ans, num);
		}

		System.out.println(ans);
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
