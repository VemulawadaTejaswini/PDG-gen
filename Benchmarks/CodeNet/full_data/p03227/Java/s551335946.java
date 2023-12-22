import java.util.Scanner;

public class Main {
  public static void main(String args[]){
    Scanner s = new Scanner(System.in);
    String str = s.next();
    char[] c = str.toCharArray();
    if(c.length == 3){
      char temp = c[0];
      c[0] = c[2];
      c[2] = temp;
    }
    System.out.println(c);
  }
}