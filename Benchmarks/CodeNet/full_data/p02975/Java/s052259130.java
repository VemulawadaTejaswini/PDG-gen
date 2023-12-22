import java.util.Scanner;

public class Main {
	public static void main(String[]args) {
		try(Scanner scan = new Scanner(System.in)){

			int N = scan.nextInt();
			int[]a = new int[N];
			long s = 0;
			for(int i = 0;i<N;i++) {
				a[i] = scan.nextInt();

				s = s^(long)a[i];

			}

			int ok = 1;

			for(int i = 0;i<N;i++) {
				if((s^a[i])!=(long)a[i]) {
					ok=0;
					break;
				}
			}

			if(ok==0)System.out.println("No");
			else System.out.println("Yes");


		}


	}


}
