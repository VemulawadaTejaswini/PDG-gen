import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    double x = 0;
    String u = null;
    double ans = 0;
    for(int i=0;i<n;i++){
      x = sc.nextDouble();
      u = sc.next();
      if(u.equals("JPY")){
        ans += x;
      } else {
        ans += x*380000;
      }
    }
    System.out.println(ans);
  }
}