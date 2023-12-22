import java.util.Comparator;
import java.util.Scanner;

class Main{


	static int[][] map ;
	static long INF =Long.MAX_VALUE/2;
	static int n,m ;
	static	long[] dis;

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);			//文字の入力
		int n = sc.nextInt();
		int T = sc.nextInt();
		int[] t = new int[n+1];
		
		for(int i = 1;i <= n;i++){
			t[i] = sc.nextInt();

		}
		
		long ans = 0;
		for(int i = 1;i < n;i++){
			if(t[i+1] - t[i] <= T){
				ans += t[i+1] - t[i];
			}else{
				ans += T;
			}
		}
		
		ans += T;
		
		
		




		System.out.println(ans);




	}
}





class MyComparator implements Comparator {

	public int compare(Object obj1, Object obj2) {

		int num1 = (int)obj1;
		int num2 = (int)obj2;

		if(num1 < num2) {
			return 1;
		} else if(num1 > num2) {
			return -1;
		} else{
			return 0;
		}
	}
}


