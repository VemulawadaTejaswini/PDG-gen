import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
class Main{


	static final int MOD = 1000000007;


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);			//文字の入力
		long a = sc.nextLong();
		long b = sc.nextLong();



		ArrayList<Long> aa = new ArrayList<Long>();
		ArrayList<Long> bb = new ArrayList<Long>();


		long limit =(int)Math.sqrt(a);
		for(long i = 1;i*i <= a;i++){
			limit = i;
		}
		for(long i = 2;i <= limit;i++){
			if(a%i == 0){
				aa.add((long) i);

				a /= i;
				while(a != 1 && a%i == 0){
					a /= i;
				}
				if( a == 1){
					break;
				}
			}
		}
		for(long i = 1;i*i <= b;i++){
			limit = i;
		}
		for(long i = 2;i <= limit;i++){
			if(b%i == 0){

				bb.add((long) i);

				b /= i;
				while(b != 1 && b%i == 0){
					b /= i;
				}				
				if( b == 1){
					break;
				}
			}
		}
		int ans = 0;
		HashSet<Long> set = new HashSet<Long>();
		for(int i = 0;i < aa.size();i++){
			set.add(aa.get(i));
		}
		for(int i = 0;i < bb.size();i++){
			if(set.contains(bb.get(i))){
				ans++;
			}
		}

		System.out.println(ans+1);




	}

	static void sieve(ArrayList<Long> list){
		int n = 50000000;
		boolean[] is_prime = new boolean[n+1];
		int[] prime = new int[n];
		for(int i= 0;i <=n;i++){
			is_prime[i] = true;
		}
		list.add((long) 1);
		for(int i = 2;i <= n;i++){
			if(is_prime[i]){
				list.add((long)i);
				for(int j = 2*i;j <= n;j+=i){
					is_prime[j] = false;
				}
			}
		}



	}




	static int upperbond(int k,int min,int[] data){		//kより小さい最大の値をdataの中から探し、返す二分探索
		int max = data.length;
		//		if(min == data.length-1){
		//			if(data[min] > k){
		//				return min;
		//			}
		//		}

		while(max-min > 1){
			int mid = (max+min)/2;
			if(data[mid] >= k){
				max = mid;
			}else{
				min = mid;
			}
		}

		return max;
	}

	static int lowerbond(int k,int min,int[] data){		//kより大きい最小の値をdataの中から探し、返す二分探索
		int max = data.length;

		while(max-min > 1){
			int mid = (max+min)/2;
			if(data[mid] >= k){
				max = mid;
			}else{
				min = mid;
			}
		}
		return min;
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


class Edge extends ArrayList<P>{

}

class P{
	int to;
	long cost;
	P(int to,long cost){
		this.to = to;
		this.cost = cost;
	}
}


class Pair implements Comparable{
	int from;
	int end;
	@Override
	public int compareTo(Object other) {
		Pair otherpair = (Pair)other;

		return   from- otherpair.from;
	}








}




