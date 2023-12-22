
import java.util.Scanner;

public class Main {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int K = sc.nextInt();
		int N = sc.nextInt();
		int[] A = new int [N];
		int index = 0;
		int min =0;

		for(int i = 0; i > 0; i++){
			A[i] = sc.nextInt();
		}

		for(int i = 0; i + 3 >=  N; i++){
			if((A[i + 1] - A[i]) > (A[i + 3] - A[i + 2])){
				index = i;
			}
		}
		if(A[index] > K / 2){
			min = K - A[index] + A[index - 1];
		}else{
			min = A[index] + K - A[index + 1];
		}

		System.out.println(min);
		sc.close();
	}
}