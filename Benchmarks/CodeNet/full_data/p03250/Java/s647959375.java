import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int A = sc.nextInt();
    int B = sc.nextInt();
    int C = sc.nextInt();
    int sum1 = A + B + 10*C;
    int sum2 = C + A + 10*B;
    int sum3 = B + C + 10*A;
    System.out.println(Math.max(Math.max(sum1, sum2), sum3));
  }
}
