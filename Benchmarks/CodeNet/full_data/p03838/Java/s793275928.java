import java.util.*;
public class Main {

  public static void main(String[] args) { 
      Scanner sc = new Scanner(System.in);
      int x = sc.nextInt();
      int y = sc.nextInt();
      if(x == y)
        System.out.println(0);
      else if(x < y) {
        System.out.println(y - x);
      } else if( x * -1 == y) 
        System.out.println(1);
      else {
        System.out.println(Math.abs(Math.abs(x) - Math.abs(y)) + 2);
      }
  }
}