import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    long t = 1;
    long a = 1;
    for(int i = 0; i < n; i++){
      long tt = sc.nextLong();
      long aa = sc.nextLong();
      long max = (long)Math.max(Math.ceil(t / (double)tt), Math.ceil(a / (double)aa));
      t = max * tt;
      a = max * aa;
    }
    System.out.println(a + t);
  }
}