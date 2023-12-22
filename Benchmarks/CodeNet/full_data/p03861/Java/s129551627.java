import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    long a = sc.nextLong();
    long b = sc.nextLong();
    long x = sc.nextLong();
    int geta = (a==0) ? 1 : 0;
    System.out.println(b/x-a/x +geta);
  }
}