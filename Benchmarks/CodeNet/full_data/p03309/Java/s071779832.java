import java.util.Arrays;
import java.util.Scanner;

class Main{

	static char[][] map;
	static int H;
	static int W;

	public static void main(String[] args) {



		Scanner sc = new Scanner(System.in);			//文字の入力
		int N =sc.nextInt();
		int[] a = new int[N];
		
		for(int i = 0;i < N;i++){
			a[i] = sc.nextInt();
		}
		
		int[] c = a.clone();
		Arrays.sort(c);
		int mid = c[N/2];
		
		
		int ans =0 ;
		for(int i = 0;i < N;i++){
			ans += Math.abs(a[i]-(mid+i+1));
		}
		System.out.println(ans);

	}
}



