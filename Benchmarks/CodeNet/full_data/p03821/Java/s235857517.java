import java.util.Scanner;

public class Main {
	public static void main(String[]args) {
		try(Scanner scan = new Scanner(System.in)){

			int N = scan.nextInt();

			long[]A = new long[N];
			long[]B = new long[N];

			for(int i = 0;i<N;i++) {
				A[i] = scan.nextLong();
				B[i] = scan.nextLong();
			}


			long count = 0;

			for(int i = N-1;i>=0;i--) {
				A[i]+=count;
				long s=0;
				if(A[i]%B[i]!=0)
				 s = B[i]-A[i]%B[i];
				count+=s;
			}

			System.out.println(count);


		}


	}


}
