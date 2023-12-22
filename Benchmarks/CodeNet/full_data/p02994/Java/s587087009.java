import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
		 
		 int N = scan.nextInt();
		 int L = scan.nextInt();
		 
		 int apple_pie_taste = 0; 
		 for (int i = 0; i < N; i++ ) {
			 apple_pie_taste += L + i;
		 }		 
		 
		 if (L > 0) {
			 apple_pie_taste -= L;
		 } else if (L < 0 && N >= Math.abs(L)) {
			 apple_pie_taste += 0;
		 } else {
			 apple_pie_taste += Math.abs(L) - N + 1;
		 }
		 
		 System.out.println(apple_pie_taste);
		 
		 scan.close();
		 
	}

}
