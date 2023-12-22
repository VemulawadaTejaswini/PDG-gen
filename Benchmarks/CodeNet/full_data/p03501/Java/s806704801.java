import java.util.Scanner;

public class practice80a {

	public static void main(String[] args) {
		
		 Scanner scan = new Scanner(System.in);
		 
		 int n = scan.nextInt();
		 int a = scan.nextInt();
		 int b = scan.nextInt();
		 
		 int fee = n*a;
		 
		 if(fee > b) {
			 fee = b;
		 }
		 
		 System.out.print(fee);

	}

}
