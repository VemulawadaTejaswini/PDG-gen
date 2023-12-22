import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		
		int x = in.nextInt();
      	
      	int numberof500 = x/500;
        int remainder = x%500;
      
      System.out.println(1000*numberof500+remainder);
	}
}
