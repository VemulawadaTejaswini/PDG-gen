import java.util.*;
public class Main {

  public static void main(String[] args) { 
      Scanner sc = new Scanner(System.in);
      String s = sc.next();
      int cost = 700;
      for(char c : s.toCharArray())
        if(c != 'x')
          cost += 100;
      System.out.println(cost);
  }
}