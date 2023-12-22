import java.util.Arrays;
import java.util.Scanner;

class Main{


	public static void main(String[] args) {
		

		Scanner sc = new Scanner(System.in);			//文字の入力
		int n = sc.nextInt();
		long[] T = new long[n];

		long x=1L;
		for(int i = 0;i < n;i++){
			T[i]  = sc.nextLong();
		}
		Arrays.sort(T);

		for(int i = 0;i < n;i++){
			x = lcm(T[i], x);
		}



		System.out.println(x);

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