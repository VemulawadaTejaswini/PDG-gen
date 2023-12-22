import java.util.*;

 // Compiler version JDK 11.0.2

  public class Main
 {
   public static void main(String args[])
   { 
    Scanner sc= new Scanner (System.in);
    int a= sc.nextInt();
    int b= sc.nextInt();
    int c= sc.nextInt();
    int t=b;
    b=a;
    a=c;
    c=t;
    System.out.println(a+" "+b+" "+c);
    
   }
 }
