import java.util.Arrays;
import java.util.Scanner;
class Main{


	static char[][] map;

	static int[][] c;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);			//文字の入力
		int n = sc.nextInt();
		int k = sc.nextInt();
		long ans = 0;
		long mod = 1000000000 + 7;
		
		c = new int[4005][4005];
		c[0][0] = 1;
		for(int i = 0;i <= 4000;i++){
			for(int j = 0;j <= i;j++){
				c[i+1][j] += c[i][j];
				c[i+1][j+1] += c[i][j];
			}
		}
		

		for(int i = 1;i <= k;i++){
			long blue = f(k,i);
			long red = 0;
			red += f(n-k,i-1);
			red += f(n-k,i);
			red += f(n-k,i);
			red += f(n-k,i+1);
			ans = blue * red % mod;
			System.out.println(ans);
		}
	}
	
	static int f(int n,int k){
		if(n < k){
			return 0;
		}
		if(n == 0 && k == 0){
			return 1;
		}
		
		if(k < 1){
			return 0;
		}
		return f2(n-k,k);
	}
	
	static int f2(int n, int k){
		return comd(n, k);
	}
	
	static int comd(int n,int k){
		return c[n][k];
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







	static int find(int index,int current,int[] students,int ans,int[][] memo){
		if(current == index){
			return 1;
		}

		if(memo[current][index] != 0){
			return memo[current][index];
		}

		memo[current][index] = find(index, students[current]-1, students, ans+1, memo)+1;

		return memo[current][index];
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




