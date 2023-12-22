import java.util.*;
 
public class Main{
  public static void main(String...args){
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();
    switch(n){
      case 1: System.out.println("Hello World"); break;
      case 2: int a = s.nextInt(), b = s.nextInt(); System.out.println(a + b); break;
    }
  }
}