import java.util.*;

public class Main{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int N = Integer.parseInt(sc.next());
    
    float ans = 0;
    for(int i = 0; i < N; i++){
      double a = Double.parseDouble(sc.next());
      String s = sc.next();
      if(s.equals("BTC")){
        a *= 380000.0;
      }
      ans += a;
    }
    System.out.println(ans);
  }
}