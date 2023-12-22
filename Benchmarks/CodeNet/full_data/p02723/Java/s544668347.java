import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		int x = in.nextInt();
      	
      	long numberof500 = x/500;
        long remainder = x%500;
        long numberof5 = remainder/5;
      	long ans = 1000*numberof500+5*numberof5;
      
      System.out.println(ans);
	}
}
