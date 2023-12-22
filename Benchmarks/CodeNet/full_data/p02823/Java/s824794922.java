import java.util.*;
public class Main {

  public static void main(String[] args) { 
      Scanner sc = new Scanner(System.in);
      long n = sc.nextLong();
      long a = sc.nextLong();
      long b = sc.nextLong();

      if(b - a % 2 == 0) {
        System.out.println((b - a) / 2);
        return;
      }
      
      
      long leftCnt = a - 1;
      long nb = b - (a - 1);
      if(nb % 2 == 0) {
          leftCnt++;
          nb--;
      }
      leftCnt += (nb-1) / 2;

      long rightCnt = n - b;
      long na = a + (n - b);
      if((na % 2) != (n % 2)) {
        rightCnt++;
        na++;
      }
      rightCnt += (n - na) / 2;
     
      System.out.println(Math.min(leftCnt, rightCnt));
  }
}