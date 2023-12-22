import java.util.*;
public class Main {

  public static void main(String[] args) { 
      Scanner sc = new Scanner(System.in);
      long n = sc.nextInt();
      long m = sc.nextInt();
      long days = 0;
      for(long i = 0; i < m; i++)
        days += sc.nextLong();
      long diff = n - days;
      System.out.println(diff < 0 ? -1 : diff);
  }
}