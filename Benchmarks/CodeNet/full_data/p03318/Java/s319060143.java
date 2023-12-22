import java.util.*;
public class Main {

  public static void main(String[] args) { 
      Scanner sc = new Scanner(System.in);
      long k = sc.nextLong();
      
      for(int i = 1; i <= Math.min(k, 9); i++)
        System.out.println(i);
      if(k < 10)
        return;
      for(int i = 1; i <= k - 10 + 1; i++)
        System.out.println(10 * i + 9);
  }
}