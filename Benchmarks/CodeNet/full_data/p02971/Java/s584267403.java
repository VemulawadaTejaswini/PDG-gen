import java.util.Arrays;
import java.util.Scanner;
class Main{


	static char[][] map;

	static long[][] c;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);			//文字の入力
		int n = sc.nextInt();
		int[] a = new int[n];
		int[] d = new int[n];
		for(int i = 0;i < n;i++){
			a[i] = sc.nextInt();
			d[i] = a[i];
 		}
		
		Arrays.sort(d);
		int max = d[n-1];
		int judge = 0;
		if(d[n-1] == d[n-2]){
			judge = 1;
		}
		
		if(judge == 1){
			for(int i = 0;i < n;i++){
				System.out.println(max);
	 		}
		}else{
			for(int i = 0;i < n;i++){
				if(a[i] == max){
					System.out.println(d[n-2]);
				}else{
					System.out.println(max);

				}
	 		}
		}

		
		
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




