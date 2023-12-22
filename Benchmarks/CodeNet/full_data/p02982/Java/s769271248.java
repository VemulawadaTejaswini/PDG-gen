import java.util.Scanner;
class Main{


	static char[][] map;

	static long[][] c;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);			//文字の入力
		int n = sc.nextInt();
		int d = sc.nextInt();
		
		int[][] data = new int[n][d];
		for(int i = 0;i < n;i++){
			for(int j = 0;j < d;j++){
				data[i][j] = sc.nextInt();
			}
		}
		int ans = 0;
		for(int i = 0;i < n;i++){
			for(int j = i + 1;j < n;j++){
				int calc = 0;
				for(int k = 0;k < d;k++){
					calc += Math.abs(data[i][k] - data[j][k])*Math.abs(data[i][k] - data[j][k]);
				}
				if(judge(calc)){
					ans++;
				}
			}
		}
		System.out.print(ans);
		
		

		
	}
	
	static boolean judge(int num){
		
		for(int i = 1;i*i <= num;i++){
			if(i*i == num){
				return true;
			}
		}
		
		return false;
		
		
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




