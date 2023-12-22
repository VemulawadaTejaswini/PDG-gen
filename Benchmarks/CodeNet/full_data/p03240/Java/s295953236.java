import java.util.Scanner;



public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		long[][] A = new long[N][3];

		for(int i = 0 ; i < N ; i++){
			A[i][0] = Long.parseLong(sc.next());
			A[i][1] = Long.parseLong(sc.next());
			A[i][2] = Long.parseLong(sc.next());
		}

		sc.close();

		long[] S = new long[N];

		int count = 0;
		for(int i = 0 ; i <= 55 ; i++){
			for(int j = 0 ; j <= 80 ; j++){
				for(int k = 0 ; k < N ; k++){
						S[k] = Math.abs(i-A[k][0]) + Math.abs(j-A[k][1]) + A[k][2];


/*
					for(int l = 0 ; l < N ; l++){
						System.out.print(S[l]+" ");
					}
					System.out.println("");
*/



					if(k > 0){

						if(S[k] - S[k-1] == 0){
							count++;
						}
						else if(A[k-1][2] == 0 && S[k] - S[k-1] < 0){
							count++;
						}
						else if(A[k][2] == 0 && S[k] - S[k-1] > 0){
							count++;
						}

						else{
							count = 0;
							break;
						}

						if(count == N-1 && S[k]>0){
							System.out.println(i +" "  + j + " "  + (S[k]));
							count = 0;
						}
					}

				}
			}
		}
	}
}
