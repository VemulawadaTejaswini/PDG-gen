import java.util.Scanner;
 
public class Main {
	public static void main(String[] args){
      Scanner scan = new Scanner(System.in);
      int a = scan.nextInt();
      if(1 > a || a > 100){
		throw NumberFormatException;
      }
      int b = scan.nextInt();
      if(1 > b || b > 100){
		throw NumberFormatException;
      }
      System.out.print((double)(a / b));
    }
}