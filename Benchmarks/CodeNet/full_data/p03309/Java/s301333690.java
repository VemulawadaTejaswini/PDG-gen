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
		int n = sc.nextInt();
		long[] a = new long[n];
		long sum =0;
		for(int i = 0;i < n;i++){
			a[i] = sc.nextLong()-(i+1);
			sum += a[i];
		}
		long center = sum/n;

		long ans = 1000000000;
		for(int i = -1;i <= 1;i++){
			long x = 0;
			for(int j = 0;j < n;j++){
				x += Math.abs(a[j] - (center + i));
			}
			ans = Math.min(ans, x);
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

		return from - otherpair.from;
	}
}

