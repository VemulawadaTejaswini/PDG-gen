import java.util.*;
public class Main {

  public static void main(String[] args) { 
      Scanner sc = new Scanner(System.in);
      int k = sc.nextLong();
      if(k < 10) {
        System.out.println(k);
        reutrn;
      }
      System.out.println(10 * (k - 10 + 1) + 9);
  }
}