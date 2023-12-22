import java.util.*;

public class Main{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int a = Integer.parseInt(sc.next());
    int b = Integer.parseInt(sc.next());
    
    int ans = 1;
    while(true){
      int n = a+b+ans*2;
      double m = Math.sqrt(n);
      if((int)(m*m) == n){
        break;
      }
      ans++;
    }
    
    System.out.println(ans);
  }
}