import java.util.Scanner;

class Main{
	static int n;
	static long ans = 1000000000;
	static int[] memo;
	static int[] dp;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);			//文字の入力
		int n = sc.nextInt();
		int t = sc.nextInt()*1000;
		int a = sc.nextInt() * 1000;
		int[] h = new int[n];
		for(int i = 0;i < n;i++){
			h[i] = sc.nextInt() ;
		}
		int ans = 1000000000;
		int key = 0;
		for(int i = 0;i < n;i++){
			int d = Math.abs(a - (t-h[i]*6));
			if(d < ans){
				key = i+1;
				ans = Math.min(ans, d);
			}
		}
		System.out.println(key);
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
