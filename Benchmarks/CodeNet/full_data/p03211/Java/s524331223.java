import java.util.Scanner;

class Main{
	static final long MOD = 1000000007;

	static int H, W, K;
	static long[][] dp = new long[110][10];



	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);			//文字の入力
		String number = sc.next();
		int ans = 1000000000;
			for(int j = 0;j + 3 <= number.length();j++){
				String sub = number.substring(j, j+3);
				int num = Integer.parseInt(sub);
				int sum = Math.abs(753-num);
				ans = Math.min(ans, sum);
			
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
