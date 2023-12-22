import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    double ans = (a + b) /2;
    System.out.println((int)Math.ceil(ans));
  }
}
