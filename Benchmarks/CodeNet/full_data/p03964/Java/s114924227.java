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
      long max = Math.max(gaus(t, tt), gaus(a, aa));
      t = max * tt;
      a = max * aa;
    }
    System.out.println(a + t);
  }
  
  public static long gaus(long t, long tt){
    if(t % tt == 0){
      return t / tt;
    }
    return t / tt + 1;
  }
}