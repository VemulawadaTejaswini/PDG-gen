import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

class Main{

	static int N;
	static int M;
	static 		ArrayList<ArrayList<Integer>> map;
	static boolean[] used;
	static int f = 0;
	static int s = 0;

	static long mod = 1000000007;
	static ArrayList<Integer> saitan;




	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);			//文字の入力
		int n = sc.nextInt();
		int[] s  = new int[n];
		int ans = 0;

		for(int i = 0;i < n;i++){
			s[i] = sc.nextInt();
			ans += s[i];
		}
		Arrays.sort(s);
		
		for(int i = 0;i < n;i++){
			if(ans % 10 != 0){
				System.out.println(ans);
				return;
			}else{
				if(s[i] % 10 != 0){
					ans -= s[i];
				}
			}
		}
		
		System.out.println(0);

		







	}
	static int lowerbond(int k, int[] data){		//kより小さい最小の値をdataの中から探し、返す二分探索
		int min = -1;
		int max = data.length;

		while(max-min > 1){
			int mid = (max+min)/2;
			if(data[mid] >= k){
				max = mid;
			}else{
				min = mid;
			}
		}
		return data[max];
	}


	static long cal(int n){
		long x = (long)n;
		for(int i = n-1;i > 0;i--){
			//	System.out.println(i);
			x *= i;
			x %= mod;
		}
		return x;
	}

}


