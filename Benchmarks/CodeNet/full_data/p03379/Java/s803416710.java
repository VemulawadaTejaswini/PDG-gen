import java.util.Arrays;
import java.util.Scanner;

class Main{

	static char[][] map;
	//	static int N;
	//	static int M;
	static boolean flag;
	static int ans;



	public static void main(String[] args) {



		Scanner sc = new Scanner(System.in);			//文字の入力
		int N =sc.nextInt();

		int[] X = new int[N];


		for(int i = 0;i < N;i++){
			X[i] = sc.nextInt();
		}
		int[] sub = X.clone();
		Arrays.sort(sub);


		for(int i = 0;i < N;i++){
			if(sub[N/2] > X[i] )

				System.out.println(sub[N/2]);
			else{
				System.out.println(sub[(N/2)-1]);

			}
		}
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



