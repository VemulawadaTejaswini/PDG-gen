import java.util.Arrays;
import java.util.Scanner;

class Main{

	static char[][] map;
	static int H;
	static int W;

	public static void main(String[] args) {



		Scanner sc = new Scanner(System.in);			//文字の入力
		//int N =sc.nextInt();
		int N =sc.nextInt();
		int[] a = new int[N];
		int sum = 0;
		for(int i = 0;i < N;i++){
			a[i] = sc.nextInt()-(i+1);
			sum += a[i];
		}
		int[] c = a.clone();
		
		Arrays.sort(c);
		int mid = c[(N-1)/2];
		
		int ans =0 ;
		for(int i = 0;i < N;i++){
			ans += Math.abs(mid-a[i]);
		}
		
			System.out.println(ans);

		
		



	}
}




class Pair implements Comparable{
	String from;
	int end;
	@Override
	public int compareTo(Object other) {
		Pair otherpair = (Pair)other;

		return end - otherpair.end;
	}
}



