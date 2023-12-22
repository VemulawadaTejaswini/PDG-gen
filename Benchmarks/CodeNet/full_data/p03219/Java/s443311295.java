import java.util.Scanner;

class Main{
	static int n;
	static long ans = 1000000000;
	static int[] memo;
	static int[] dp;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);			//文字の入力
		int n = sc.nextInt();
		int m = sc.nextInt();
		int ans = n + m/2;
		System.out.print(ans);
	}
}







class Pair implements Comparable{
	int from;
	int end;
	int dis;
	@Override
	public int compareTo(Object other) {
		Pair otherpair = (Pair)other;

		return dis - otherpair.dis;
	}
}
