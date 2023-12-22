import java.util.ArrayList;
import java.util.Scanner;

class Main{

	static int N;
	static int M;
	static 		ArrayList<ArrayList<Integer>> map;
	static boolean[] used;
	static int f = 0;
	static int s = 0;

	static long mod = 1000000007;
	static ArrayList<Integer> saitan;




	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);			//文字の入力
		int n = sc.nextInt();
		int m = sc.nextInt();

		if(n == m){
			long y = cal(n);
			System.out.println((y*y)*2%mod);
			return;
		}else if(Math.abs(n-m)==1){
			long a = cal(n);
			long b = cal(m);
			System.out.println(a*b%mod);

			
			
		}else{
			System.out.println(0);
		}




	}

	static long cal(int n){
		long x = (long)n;
		for(int i = n-1;i > 0;i--){
		//	System.out.println(i);
			x *= i;
			x %= mod;
		}
		return x;
	}

}


