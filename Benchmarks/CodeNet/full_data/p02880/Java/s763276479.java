import java.util.Scanner;
class Main{


	static char[][] map;

	static long[][] c;
	static int ans;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);			//文字の入力
		int n = sc.nextInt();
		if(n >= 82){
			System.out.println("No");
			return;
		}else{
			for(int i = 1;i <= 9;i++){
				if(n % i == 0){
					if(n/i <= 9){
						System.out.println("Yes");
						return;
					}
				}
			}
		}
		System.out.println("No");



	}
	
//	static void dfs(int y,int x,int num,int count){
//		if((y+1)*(x+1) > num){
//			return;
//		}
//		if((y + 1)*(x+1) == num){
//			ans = Math.min(ans, count);
//			return;
//		}
//		
//		if(y + 1 <= )
//		dfs(y+1, x, num, count);
//		
//	}

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




