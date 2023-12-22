import java.util.Scanner;

public class Main {
	public static void main(String[]args) {
		try(Scanner scan = new Scanner(System.in)){

			int N = scan.nextInt();
			int M = scan.nextInt();
			int K = scan.nextInt();



			int goukei = 0;
			int ok = 0;
			for(int i = 1;i<=N;i++) {
				for(int j = 1;j<=M;j++) {
					goukei =  i*M+j*N-2*i*j;
					if(goukei==K) {
						ok=1;break;
					}
				}
			}

			if(ok==1)System.out.println("Yes");
			else System.out.println("No");

		}


	}


}
