import java.util.*;
public class Main{

  public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      
      System.out.println( n % digitSum(n) == 0 ? "Yes" : "No");
  }

  private static int digitSum(int n) {
      int sum = 0;
      while(n > 0) {
          sum += n % 10;
          n /= 10;
      }
      return sum;
  }
}

