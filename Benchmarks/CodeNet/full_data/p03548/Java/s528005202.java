import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				Scanner scan = new Scanner(System.in);
				int X = scan.nextInt();
			
				int Y = scan.nextInt();
				
				int Z = scan.nextInt();
				
				int result = 0;
				
				result = (X - 2*Z-(Y-1)*Z)/Y;
				System.out.println(result);
	}

}