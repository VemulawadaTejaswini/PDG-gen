import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sunuke = new Scanner(System.in);
    String pass = sunuke.next();
    
    String p1 = pass.substring(0,1);
    String p2 = pass.substring(1,2);
    String p3 = pass.substring(2,3);
    String p4 = pass.substring(3,4);

    if (p1.equals(p2) || p2.equals(p3) || p3.equals(p4)) {
       System.out.println("Bad");
       }
    else{
       System.out.println("Good");
       }    
  }
}