import java.util.Scanner;
class Main{


	static char[][] map;

	static long[][] c;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);			//文字の入力
		int n = sc.nextInt();
		int[] p = new int[n];
		for(int i = 0;i < n;i++){
			p[i] = sc.nextInt();
			
		}
		if(check(p)){
			System.out.println("YES");
			return;
		}
		for(int i= 0;i < n;i++){
			
			for(int j = i + 1;j < n;j++){
				int[] cc = p.clone();
				cc[i] = p[j];
				cc[j] = p[i];
				if(check(cc)){
					System.out.println("YES");
					return;
				}
			}
		}
		System.out.println("NO");


		
	}
	static boolean check(int[] cc){
		for(int i = 0;i < cc.length-1;i++){
			if(cc[i] > cc[i+1]){
				return false;
			}
		}
		return true;
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




