import java.util.Scanner;

class Main{

	public static void main(String[] args) {


		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int[]a = new int[N];
		long sum = 1;
		for(int i = 0;i < N;i++){
			a[i] = scan.nextInt();
			sum *= a[i];

		}
		int min = Integer.MAX_VALUE;
		for(int i= 0;i < N;i++){
			min = Math.min(min, a[i]);
		}


		int ans = 0;
		for(int j= 1;j <min;j++){
			int sub = 0;
			for(int i= 0;i < N;i++){
				sub += (sum-j)%a[i];

			}
			ans = Math.max(ans,sub );
		}



		System.out.println(ans);

	}
}






