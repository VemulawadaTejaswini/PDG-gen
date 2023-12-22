import java.util.*;

public class Main{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int x = sc.nextInt();
    int c = a * a * b;
    double d = (double)x/(a*a);
    double f = 0.0;
    double t = 0.0;
    double ans = 0.0;
    if(d*2 > b){
      f = (b-d)*2;
      t = Math.atan(f/a);
      ans = t*(180/Math.PI);
    }else{
      double S = (double)x/a;
      f = S*2/b;
      t = Math.atan(f/b);
      ans =90 - (t*180/Math.PI);
    }
    System.out.println(ans);
  }
}