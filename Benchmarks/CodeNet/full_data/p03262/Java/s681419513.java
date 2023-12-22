import java.util.Arrays;
import java.util.Scanner;

class Main{



	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);			//文字の入力
		int N = sc.nextInt();
		int X = sc.nextInt();
		int[] x = new int[N];
		for(int i = 0;i < N;i++){
			x[i] = sc.nextInt();
		}
		if(N == 1){
			System.out.println(Math.abs(x[0]-X));
			return;
		}
		
		Arrays.sort(x);
		int[] dis = new int[N];
		for(int i = 0;i < N;i++){
			dis[i] =Math.abs(X - x[i]);
		}
		Arrays.sort(dis);
//		for(int i = 0;i < N ;i++){
//			System.out.println(dis[i]);
//		}
		int[] yakusuu = new int[N-1];
		for(int i = 0;i < N-1;i++){
			yakusuu[i] =(int)gcd(dis[i+1], dis[i]);
			dis[i+1] = yakusuu[i];
			}
		
		System.out.println(yakusuu[N-2]);
		
	}

	static long gcd(long a,long b){
		if(b == 0){
			return a;
		}else{
			return gcd(b, a%b);
		}
	}



}




class Pair implements Comparable{
	int from;		//p
	int end;		//y
	int num;
	int bango;
	@Override
	public int compareTo(Object other) {
		Pair otherpair = (Pair)other;

		return from - otherpair.from;
	}
}

