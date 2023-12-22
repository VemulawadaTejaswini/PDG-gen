import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int K = sc.nextInt();
		int A[]=new int[N];
		int One=0;
		for(int i=0;i<N;i++){
			A[i] = sc.nextInt();
			if(A[i]==1){
				One=i;
			}
		}
		System.out.println((N+K-3)/(K-1));



	}

}
