import java.util.ArrayList;
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
		int[] a = new int[n];

		boolean[] color = new boolean[8];
		int godcolor = 0;


		for(int i = 0;i < n;i++){
			a[i] =sc.nextInt();
			if(a[i] < 400){
				color[0] = true;
			}else if(a[i] < 800){
				color[1] = true;

			}else if(a[i] < 1200){
				color[2] = true;

			}else if(a[i] < 1600){
				color[3] = true;

			}else if(a[i] < 2000){
				color[4] = true;

			}else if(a[i] < 2400){
				color[5] = true;

			}else if(a[i] < 2800){
				color[6] = true;

			}else if(a[i] < 3200){
				color[7] = true;

			}else{
				godcolor++;
			}
		}

		int ansmax = 0;
		int ansmin = 0;
		int count = 0;

		for(int i = 0;i <8;i++){
			if(color[i]){
				count++;
			}
		}
		
		ansmax = count + godcolor;
		ansmin = count;
		if(ansmin == 0){
			ansmin = 1;
		}
		System.out.println(ansmin + " "+ansmax);
		



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


