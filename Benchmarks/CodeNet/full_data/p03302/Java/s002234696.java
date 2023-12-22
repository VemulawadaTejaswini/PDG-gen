import java.util.Scanner;
 
public class Main {
	  public static void main(String args[]) {
		    Scanner scanner = new Scanner(System.in);
 
 
		    String str1 = scanner.next();
            String str2 = scanner.next();
 
            int A = Integer.parseInt(str1);
            int B = Integer.parseInt(str2);
 
           if(A + B == 15)
           {
        	   System.out.println("+");
           }
           else if(A * B == 15)
           {
        	   System.out.println("*");
           }
           else 
           {
        	   System.out.println("x");
           }
        	scanner.close();}
		  }