import java.io.*;
import java.util.Scanner;

public class Main {

   public static void main(String args[]) {

    Scanner scan = new Scanner(System.in);

     String l = scan.next();
	 String m =scan.next();     
	 String n = scan.next();     
    int a = Integer.parseInt(l);
    int b = Integer.parseInt(m);
    int c = Integer.parseInt(n);

    
          	if ((a == b && b == c)&&(b == c && a == c))  {
          		System.out.println("1");
          	   } else if ((a != b && b !=c)&&(b !=c && c != a)) {
          	   	 System.out.println("3");
          	   	} else {
          	   	 System.out.println("2");
   } 
   }
   }
   