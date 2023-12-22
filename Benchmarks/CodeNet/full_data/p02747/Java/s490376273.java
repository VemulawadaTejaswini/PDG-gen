import java.util.Scanner;
 
public class Main{
  public static void main(String args[]){ 
    Scanner scan = new Scanner(System.in);
    String str = scan.next();
    String hiCount = str.replaceAll("hi", "");
    if (hiCount.length()%2 == 1) {
      System.out.println("No");      
      return
    }
    if(hiCount.length() == 0) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
   }
}