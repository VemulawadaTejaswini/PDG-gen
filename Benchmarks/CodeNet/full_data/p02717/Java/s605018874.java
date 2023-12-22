import java.util.Scanner;

public class Main{
	public static void main(String[]args) {
		try(Scanner scan = new Scanner(System.in)){
			
			int X = scan.nextInt();
			int Y = scan.nextInt();
			int Z = scan.nextInt();
			
			int t = 0;
			int s = 0;
			
			t = X;
			X =Y;
			Y = t;
			
			s = X;
			X = Z;
			Z = s;
			
			System.out.println(X);
			System.out.println(Y);
			System.out.println(Z);
			
			
		}
		
		
	}
		

}
