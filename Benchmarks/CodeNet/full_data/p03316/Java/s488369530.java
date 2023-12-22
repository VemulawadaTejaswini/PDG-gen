import java.util.*;
public class Main {

  public static void main(String[] args) { 
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int num = n;
      int digitSum = 0;
      while(num > 0) {
        digitSum += num % 10;
        num /= 10;
      }
      if(n % digitSum == 0)
      System.out.println("Yes");
      else
      System.out.println("No");
  }
}