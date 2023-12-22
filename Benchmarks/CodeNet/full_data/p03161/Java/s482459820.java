
import java.util.Scanner;


public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
			int N = sc.nextInt();
			int K = sc.nextInt();

			int[] H = new int[N];
			for(int i = 0 ; i < N ; i++){
				H[i] = sc.nextInt();
			}
		sc.close();


		int[] memo = new int[N];

		memo[0] = 0;
		memo[1] = Math.abs(H[1]-H[0]);

		int tmp = 0;

		for(int i = 2 ; i < N ; i++){
			for(int j = 0 ; j < N-1 ; j++){

				if(i-j <= K){
				tmp = memo[j] + Math.abs(H[i]-H[j]);
				}else{
					continue;
				}

				if(i == j){
					break;
				}

				/*
				System.out.println(i + " " + j);
				System.out.println("H[i] "+ H[i] +"  " + "memo[j] " + memo[j] );
				System.out.println("tmp " + tmp);
				*/

				if(memo[i] == 0 || tmp < memo[i]){
					memo[i] = tmp;
				}
			}
		}

		System.out.println(memo[N-1]);


	}
}