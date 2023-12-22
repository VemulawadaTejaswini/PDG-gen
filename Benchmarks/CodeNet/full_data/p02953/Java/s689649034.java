import java.util.Scanner;
class Main{


	static char[][] map;
	static final int MOD = 1000000007;


	static long[][] c;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);			//文字の入力

		int n = sc.nextInt();
		int[] h = new int[n];
		for(int i = 0;i < n;i++){
			h[i] = sc.nextInt();
		}
		for(int i = n-1;i >= 1;i--){
			if(h[i-1] > h[i]){
				h[i-1]--;
				if(h[i-1] > h[i]){
					System.out.println("No");
					return;
				}
			}
		}
		System.out.println("Yes");





	}



	static int gcd(int a,int b){				//最大公約数を返す
		if(b == 0){
			return a;
		}else{
			return gcd(b, a%b);
		}
	}
	static long gcd(long a,long b){
		if(b == 0){
			return a;
		}else{
			return gcd(b, a%b);
		}
	}



	static long lcm (long a, long b) {
		long g = gcd(a,b);
		return a/g*b;
	}




}



class Pair implements Comparable{
	int from;
	int end;
	@Override
	public int compareTo(Object other) {
		Pair otherpair = (Pair)other;

		return   end- otherpair.end;
	}








}




