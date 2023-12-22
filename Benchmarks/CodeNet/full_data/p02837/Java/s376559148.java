
import java.util.Scanner;

public class Main {
	static int[] A;
	static int[][] x;
	static int[][] y;
	static int n;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		A = new int[20];
		x = new int[20][20];
		y = new int[20][20];

		n = sc.nextInt();






		for(int i =0; i < n; i++){
			A[i] = sc.nextInt();
			for(int j = 0; j < A[i]; j++){
				x[i][j] = sc.nextInt();
				y[i][j] = sc.nextInt();


			}
		}


		int count = 0;
		int max = 1<<n;

		for(int num = 0; num < max; num++) {
			if(canConsist(num) ){
				int tmp = Integer.bitCount(num);
				if(tmp > count){
					count =tmp;
				}
			}



		}
		System.out.print(count);



	}
	static boolean canConsist(int num){
		boolean canConsist = true;

		for(int i = 0; i < n;i++){
			if(((num>>i)&1 )==0) {
				continue;

			}
			for(int j =0; j <A[i]; j++){
				if((num >>x[i][j] -1 &1 ^ y[i][j] )==1){
					return false;
				}


			}
		}
		return true;

	}


}