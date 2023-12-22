import java.util.Arrays;
import java.util.Scanner;


public class Main {
	static int N;
	static int[] T,U;
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		 N = sc.nextInt();
		 T = new int[N];
		 U = new int[N];

		 for(int i = 0 ; i < N ; i++){
			 T[i] = sc.nextInt();
			 U[i] = T[i]-(i+1);
		 }
		 sc.close();

		 Arrays.sort(U);

		 int ans1 = 0;
		 int ans2 = 0;
		 int ansa = 0;
		 int ansb = 0;
		 int ans = 0 ;

		 ans1 = U[(N+1)/2 -1];
		 ans2 = U[(N+2)/2 -1];


			 for(int i = 0 ; i < N ; i++){
				 ansa += Math.abs(T[i]-(ans1+(i+1)));
			 }

			 for(int i = 0 ; i < N ; i++){
				 ansb += Math.abs(T[i]-(ans2+(i+1)));
			 }

		if(ansa < ansb){
		 System.out.println(ansa);
		}else{
			System.out.println(ansb);
		}
 	}
}

