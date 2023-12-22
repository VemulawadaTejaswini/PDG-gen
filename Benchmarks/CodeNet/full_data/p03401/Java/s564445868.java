import java.util.Scanner;

class Main{

	//static long[] a;



	public static void main(String[] args) {



		Scanner sc = new Scanner(System.in);			//文字の入力
		int N =sc.nextInt();

		int[] A =new int[N+1];

		for(int i = 0;i < N;i++){
			A[i] =sc.nextInt();
		}
		A[N] = 0;

		int[] ans = new int[N];


		for(int i= 0;i < N;i++){
			int p = 0;
			for(int j = 0;j < N+1;j++){
				if(i != j){
					ans[i] += Math.abs(A[j] - p);
					p = A[j];
				}
			}

		}
		for(int i = 0;i < N;i++){
			System.out.println(ans[i]);
		}

	}
}


