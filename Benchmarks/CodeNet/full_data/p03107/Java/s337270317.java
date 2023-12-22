import java.util.*;
public class Main {

  public static void main(String[] args) { 
      Scanner sc = new Scanner(System.in);
      String s = sc.next();

      int oneCnt = 0;
      int zeroCnt = 0;
      for(char c : s.toCharArray())
        if(c == '0') zeroCnt++;
        else oneCnt++;
      System.out.println(Math.min(zeroCnt, oneCnt) * 2);
  }
}