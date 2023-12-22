import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
		 int N = scan.nextInt();
		 int kai = 0;
		 int index = 0;
		 
		 for (int i = 0; i < N; i++ ) {
			 index = scan.nextInt();
			 while (index % 2 == 0) {
				 kai += 1;
				 index /= 2;
			 }
		 }
		 
		 System.out.println(kai);
		 
		 scan.close();
	}

}
