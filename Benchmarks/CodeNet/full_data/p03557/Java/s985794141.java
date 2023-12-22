import java.util.Scanner;

public class Main{

	public static void main(String[] args){

		Scanner sc =  new Scanner(System.in);

		int a = sc.nextInt();
		int A[] = new int[a];
		int B[] = new int[a];
		int C[] = new int[a];
		for(int i = 0;i < a;i++){
			A[i] = sc.nextInt();
		}
		for(int i = 0;i < a;i++){
			B[i] = sc.nextInt();
		}
		for(int i = 0;i < a;i++){
			C[i] = sc.nextInt();
		}
		
		int count = 0;
		for(int i = 0;i < a;i++){
			for(int j = 0;j < a;j++){
				if(A[i] < B[j]){
					for(int l = 0;l < a;l++){
						if(B[j] < C[l]){
							count++;
						}
					}
				}
			}
		}
		System.out.println(count);
	}
}