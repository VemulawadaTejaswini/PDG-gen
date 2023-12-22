import java.util.Scanner;

public class Main {
  public static void main (String[] args) {
    Scanner in = new Scanner(System.in);
    
    while (in.hasNext()) {
      String S = in.next();
      String T = in.next();
      
      System.out.println(T + S);
    }
  }
}