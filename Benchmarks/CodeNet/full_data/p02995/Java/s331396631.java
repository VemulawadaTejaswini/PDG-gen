import java.util.*;
public class Main{
  public static int gcd(int s, int t){
    int tmp;
    long c = s;
    c *= t;
    while((tmp=s%t)!=0){
      s = t;
      t = tmp;
    }

    return (int)(c/t);
}
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    double a = Integer.parseInt(sc.next());
    double b = Integer.parseInt(sc.next());
    int c = Integer.parseInt(sc.next());
    int d = Integer.parseInt(sc.next());
    int y = gcd(c, d);
    

    double dc = Math.floor((double)b/c) -  Math.ceil((double)a/c) + 1;
    double dd = Math.floor((double)b/d) -  Math.ceil((double)a/d) + 1;
    double dcd = Math.floor((double)b/y) -  Math.ceil((double)a/y) + 1;
    
    double x = dc + dd - dcd;
    System.out.println(b-a+1-x);




  }
}