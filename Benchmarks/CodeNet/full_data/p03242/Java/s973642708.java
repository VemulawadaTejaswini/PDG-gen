import java.util.Scanner;

class Main{
	static final long MOD = 1000000007;

	static int H, W, K;
	static long[][] dp = new long[110][10];
	static int ans = 0;
	static long n = 0;





	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);			//文字の入力
		String ss = sc.next();
		StringBuilder sb = new StringBuilder();
		for(int i = 0;i < 3;i++){
			if(ss.charAt(i) == '1'){
				sb.append("9");
			}else{
				sb.append("1");

			}
		}
		ss = sb.toString();
		System.out.println(ss);

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

