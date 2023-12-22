import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
class Main{


	static final int MOD = 1000000007;


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);			//文字の入力
		int n = sc.nextInt();
		ArrayList<Pair>	 apairs = new ArrayList<Pair>();
		ArrayList<Pair>	 bpairs = new ArrayList<Pair>();

		int[] a = new int[n];
		for(int i = 0;i < n;i++){
			Pair pair = new Pair();
			a[i] = sc.nextInt();
			pair.from = a[i];
			pair.end = i;
			apairs.add(pair);
		}
		Collections.sort(apairs);

		int[] b = new int[n];
		for(int i = 0;i < n;i++){
			Pair pair = new Pair();
			b[i] = sc.nextInt();
			pair.from =b[i];
			pair.end = i;
			bpairs.add(pair);
		}

		int count = 0;
		for(int i = 0;i < n;i++){
			if(a[i] > b[i]){
				count++;
				if(count > n-2){
					System.out.println("No");
					return;
				}
				int tmpindex = upperbond(bpairs.get(i).from+1,i,apairs,bpairs);
				if(tmpindex == -1){
					System.out.println("No");
					return;
				}
				int tmp = a[i];
				a[i] = a[tmpindex];
				a[tmpindex] = tmp;

			}
		}
		System.out.println("Yes");

	}



	static int upperbond(int k,int currentindex, ArrayList<Pair> a,ArrayList<Pair> b){		//kより小さい最大の値をdataの中から探し、返す二分探索
		int min = -1;
		int max = a.size();

		while(max-min > 1){
			int mid = (max+min)/2;
			if(a.get(mid).from > k){
				max = mid;
			}else{
				min = mid;
			}
		}

		if(max == a.size()){
			max--;
		}
		for(int i = max; i>=0;i--){
			if(a.get(i).from <= b.get(currentindex).from && a.get(currentindex).from <= b.get(i).from){
				int tmp = a.get(i).end;
				a.get(i).end = a.get(currentindex).end;
				a.get(currentindex).end = tmp;
						
				return tmp;
			}
		}

		return -1;
	}

	static int lowerbond(int k, ArrayList<Integer> data){		//kより小さい最小の値をdataの中から探し、返す二分探索
		int min = -1;
		int max = data.size();

		while(max-min > 1){
			int mid = (max+min)/2;
			if(data.get(mid) >= k){
				max = mid;
			}else{
				min = mid;
			}
		}
		return data.get(min);
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

		return   from- otherpair.from;
	}








}




