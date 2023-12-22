import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
		 
		 int A = Integer.parseInt(scan.nextLine());
		 int B = Integer.parseInt(scan.nextLine());
		 int C = Integer.parseInt(scan.nextLine());
		 int X = Integer.parseInt(scan.nextLine());
		 
		 int cnt = 0;
		 
		 for (int i = 0; i < A + 1; i++) {
			 for (int j = 0; j < B + 1; j++) {
				 for (int k = 0; k < C + 1; k++) {
					 if (500 * i + 100 * j + 50 * k == X) {
						 cnt++;
					 }
				 }
			 }
		 }
		 
		 System.out.println(cnt);
		 scan.close();

	}

}
