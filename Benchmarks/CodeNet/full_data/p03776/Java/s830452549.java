import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;




class Main{


	static	ArrayList<Integer> one ;
	static	ArrayList<Integer> two ;
	static	ArrayList<Integer> three ;
	static	ArrayList<Integer> four ;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);			//文字の入力
		int n = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		long[] v =  new long[n];

		for(int i = 0;i < n;i++){
			v[i] = sc.nextLong();
		}
		Arrays.sort(v);

		long[] sumdp = new long[n];
		sumdp[0] = v[n-1];
		for(int i = 1;i < n;i++){
			sumdp[i] = v[n-i-1]+ sumdp[i-1];
		}

		double[] dp = new double[n];
		dp[0] = sumdp[0];
		for(int i = 1;i < n;i++){
			dp[i] = (double)sumdp[i]/(i+1);
		}

		double ansav = 0;

		for(int i = a-1;i < n;i++){
			ansav = (double)Math.max(ansav, dp[i]);
		}
		
		long count = 0;
		for(int i = 0;i < n;i++){
			if(dp[i] == ansav){
				count++;
			}
		}
		System.out.println(ansav);
		System.out.println(count);





	}
}

class Pair implements Comparable{
	Character from;
	int end;
	@Override
	public int compareTo(Object other) {
		Pair otherpair = (Pair)other;

		return end - otherpair.end;
	}
}


