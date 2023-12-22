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
		for(int i = 0;i < n;i++){
			a[i] = sc.nextInt();
		}
		long[] d = new long[n];
		d[0] = (long)a[0];
		for(int i = 1;i < n;i++){
			d[i] = lcm(d[i-1], a[i]);
		}
		long ans = 0l;
		for(int i = 0;i < n;i++){
			ans += (d[n-1]-1) % a[i];
		}
		System.out.println(ans);
	}
	

	static long lcm (long a, long b) {
		long g = gcd(a,b);
		return a/g*b;
	}
	
	static long gcd(long a,long b){
		if(b == 0){
			return a;
		}else{
			return gcd(b, a%b);
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

