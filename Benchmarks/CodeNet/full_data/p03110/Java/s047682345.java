import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    double ans = 0.0;
    for(int i = 0;i<n;i++){
      double x = sc.nextDouble();
      if(sc.next().equals("BTC")){
        x *= 380000;
      }
      ans+=x;
    }
    System.out.println(ans);
  }
}
