import java.util.*;
public class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    String str = sc.next();
    char s = str.charAt(0);
    switch(s){
      case 'A':
          System.out.println("T");
          break;
      case 'T':
          System.out.println("A");
          break;
      case 'C':
          System.out.println("G");
          break;
      case 'G':
          System.out.println("C");
          break;
    }
 }
}