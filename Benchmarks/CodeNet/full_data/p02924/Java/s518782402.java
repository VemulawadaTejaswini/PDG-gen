import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    long n = sc.nextLong();
    long ans = n*(n-1);
    ans = ans/2;
    System.out.println(ans);
  }
}