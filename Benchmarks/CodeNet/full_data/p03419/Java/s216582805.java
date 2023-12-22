import java.util.Scanner;

public class Main {

		public static void main(String[] args) {

			Scanner sc=new Scanner(System.in);
			int n=sc.nextInt();
			int m=sc.nextInt();
			int mi=2;
			int ni=2;
			if(n==1) ni=0;
			if(m==1)mi=0;
			
			System.out.println((m-mi)*(n-ni));
		}
	}

