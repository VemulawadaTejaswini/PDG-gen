import java.util.Scanner;
class Main{


	static char[][] map;
	static final int MOD = 1000000007;


	static long[][] c;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);			//文字の入力

		int a = sc.nextInt();
		int ans = 0;
		for(int i = 1;i <= a;i++){
			if(String.valueOf(i).length() % 2 == 1){
				ans++;
			}
		}
		System.out.println(ans);




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




