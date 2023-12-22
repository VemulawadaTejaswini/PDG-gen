import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    int sumTime = m * 1900 + (n - m) * 100;
    double p = Math.pow(0.5, m);
    double a = sumTime * p;
    double ans = a;
    for(int i = 1; i <= 10000; i++){
      ans += a * (i + 1) * Math.pow((1 - p), i);
    }
    System.out.println((int)Math.round(ans));
  }
}