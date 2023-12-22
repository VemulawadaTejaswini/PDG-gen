import java.util.*;
public class Main {

  public static void main(String[] args) { 
      Scanner sc = new Scanner(System.in);
      String s = sc.next();
      int zeroCnt = 0;
      for(char c : s.toCharArray())
        if(c == '0') zeroCnt++;

      
      System.out.println(Math.max(zeroCnt, s.length() - zeroCnt));
  }
}