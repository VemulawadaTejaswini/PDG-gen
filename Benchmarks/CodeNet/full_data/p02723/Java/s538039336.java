import java.util.*;

 // Compiler version JDK 11.0.2

  public class Dcoder
 {
   public static void main(String args[])
   { 
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the word");
    String s = sc.nextLine();
    s=s.trim();
    s=s.toLowerCase();
    boolean p = true;
    if ((s.charAt(2)==s.charAt(3))&&(s.charAt(4)==s.charAt(5)))
    p = true ;
    else 
    p = false;
    
    if(p)
    System.out.println("yes");
    else 
    System.out.println("No");
   }
 }