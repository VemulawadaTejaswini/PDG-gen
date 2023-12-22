import java.util.Arrays;
import java.util.Scanner;
class Main{


	static char[][] map;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);			//文字の入力


		int n = sc.nextInt();
		Pair[] pairs = new Pair[n];
		for(int i= 0;i < n;i++){
			Pair pair = new Pair();
			pair.from = sc.nextInt();
			pair.end = sc.nextInt();
			pairs[i] = pair;
		}
		Arrays.sort(pairs);
//		for(int i = 0;i < n;i++){
//			System.out.println(pairs[i].from + " " + pairs[i].end);
//		}
		
		
		int sum = 0;
		for(int i = 0;i < n;i++){
			sum += pairs[i].from;
			if(sum > pairs[i].end){
				
				System.out.println("No");
				return;
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


