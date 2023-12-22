import java.util.Scanner;
 
public class Main {
	public static void main(String[] args){
      Scanner scan = new Scanner(System.in);
		int a = 0;
      if(1 <= scan.nextInt() && scan.nextInt() <= 100){
		a = scan.nextInt();
      }
      int b = 0;
      if(1 <= scan.nextInt() && scan.nextInt() <= 100){
		b = scan.nextInt();
      }
      System.out.print((double)(a / b));
    }
}