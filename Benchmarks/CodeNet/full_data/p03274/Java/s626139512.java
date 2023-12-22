import java.util.Scanner;

class Main{

	public static void main(String[] args) {




		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int K = scan.nextInt();
		int[] data = new int[N];

		for(int i = 0;i < N; i++){
			data[i] = scan.nextInt();
		}

		int[] ansdata = new int[N];

		for(int i = 0;i <= N-K; i++){
			ansdata[i] = Math.abs(data[i]) + Math.abs(data[i]-data[i+K-1]) ;


		}
		int min = Integer.MAX_VALUE;
		for(int i= 0;i <= N-K;i++){
			min = Math.min(min, ansdata[i]);
		}
		
			System.out.println(min);
		



	}


}
