import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    long n = sc.nextInt();
    long a = sc.nextInt();
    long b = sc.nextInt();
    long c = a + b;


    long p = n/c;
    long q = n%c;

    if(q>a){
      q = a;
    }

    long ans = a * p + q;

    System.out.println(ans);
  }
}